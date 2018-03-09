#coding: utf-8
import subprocess
import os
import sys



CMD="kaitai-struct-compiler"
CUR_DIR=os.path.abspath(os.path.dirname(__file__))
OUT_DIR=os.path.join(CUR_DIR, 'out')
SRC_DIR=os.path.join(CUR_DIR, "src")

def output(content):
    print(content) # pylint: disable=E1601

output("Python Version is %s" % sys.version)

to_gen_types = []

if len(sys.argv) == 2:
    if sys.argv[1] not in ["java", "javascript"]:
        output("error argument type")
        exit(-1)
    else:
        to_gen_types.append(sys.argv[1])
else:
    # gen all
    to_gen_types = ['java', 'javascript']

for to_gen_type in to_gen_types:
    LANG_BASE_DIR=os.path.join(OUT_DIR, to_gen_type)

    if (to_gen_type == "java"):
        output("Gen Java....")
    elif to_gen_type == 'javascript':
        output("Gen Javascript...")

    os.makedirs(LANG_BASE_DIR, exist_ok=True)

    # iterator over all src files
    # three level structure
    # src(base)
    #         - hq 
    #             - GetSecurityList
    #                   - *.ksy
    toplevels = os.listdir(SRC_DIR)

    for toplevel in toplevels:
        cur_path = os.path.join(SRC_DIR, toplevel)
        secondlevels = os.listdir(cur_path)
        for secondlevel in secondlevels:
            cur_path = os.path.join(SRC_DIR, toplevel, secondlevel)
            thirdlevels = os.listdir(cur_path)
            for thridlevel in thirdlevels:
                cur_path = os.path.join(SRC_DIR, toplevel, secondlevel, thridlevel)
                java_name_spaces = [
                    'cc', 'rainx', 'struct', toplevel.lower(), secondlevel.lower()
                ]

                output("Generating {}".format(cur_path))
                if (to_gen_type == "java"):
                    namespace = ".".join(java_name_spaces)
                    subprocess.run([CMD, "-t", 'java', '-d', LANG_BASE_DIR, '--java-package', namespace, cur_path])
                elif to_gen_type == 'javascript':
                    file_output_dir = os.path.join(LANG_BASE_DIR, toplevel, secondlevel)
                    os.makedirs(file_output_dir, exist_ok=True)
                    subprocess.run([CMD, "-t", "javascript", '-d', file_output_dir, cur_path])

        
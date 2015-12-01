#! /bin/bash

mkdir -p dot_files
mv *.dot dot_files
cd dot_files

# convert dot file

for file in $(ls | grep .dot); do
    
    echo "start generate png file from dot file ${file}"
    dot -Tpng ${file} -o "${file}.png"
done

echo "Done ......."


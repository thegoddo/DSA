#! /bin/bash

# removes all class files from directories and sub directories

find /home/bshaw/Documents/Learning/DSA -type d -print0 | while IFS= read -r -d $'\0' dir; do
  # Skip .git directories
  if [[ "$dir" == *".git"* ]]; then
    continue
  fi
  echo "Processing directory: $dir"
  find "$dir" -maxdepth 1 -type f -name "*.class" -exec rm -v {} \;
done
import os,sys

file_stats = os.stat(str(sys.argv[1]).strip())
print file_stats.st_size

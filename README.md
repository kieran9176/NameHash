# NameHash

Given two lists of names, use hash tables to find the names that appear on both. 
• The names in the files appear one per line, and there may be duplicate names in one or both of the files.
• The lists are approximately 1000 names long. The table size is chosen so that the load
  factor is less than 4.
• Utilizes polynomial hashing.
• Each array bucket contains a linked list.

lines = [line for line in open('op.out', 'r')]
lines_file = [l.split('\n') for l in ''.join(lines).split('==================================')]
lines_file.pop(0)

c = {}

for file in lines_file:
  cn = None
  for line in file:
    if 'class' in line:
      cn = line.split(' ')[2]
      while cn in c:
        cn += '1'
        line += '1'
      c[cn] = True
      break
  fw = open(cn + '.java', 'w')
  fw.write('\n'.join(file))
  fw.flush()
  fw.close()


for n in "banana":
    print(n)

word = "bananana"
i = word.find("na")
print(i)

# what does n equal?
words = 'His e-mail is q-lar@freecodecamp.org'
pieces = words.split()
parts = pieces[3].split('-')
n = parts[1]
print(n)

counts = {'quincy': 1, 'mrugesh': 42, 'beau': 100, '0': 10}
print(counts.get('kris', 0))

counts = {'chuck': 1, 'annie': 42, 'jan': 100}
for key in counts:
    if counts[key] > 10:
        print(key, counts[key])

d = dict()
d['quincy'] = 1
d['beau'] = 5
d['kris'] = 9
for (k, i) in d.items():
    print(k, i)

import re

s = 'A message from csev@umich.edu to cwen@iupui.edu about meeting @2PM'
lst = re.findall('\\S+@\\S+', s)
print(lst)

import urllib.request

fhand = urllib.request.urlopen('http://data.pr4e.org/romeo.txt')
for line in fhand:
    print(line.decode().strip())

import json

data = '''
  [
    { 'id' : '001',
      'x' : '2',
     'name' : 'Quincy'
    } ,
    { 'id' : '009',
      'x' : '7',
      'name' : 'Mrugesh'
    }
  ]
'''
info = json.loads(data)
print(info[1]['name'])

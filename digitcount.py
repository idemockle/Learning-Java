
count_list = [0]*10

with open('nums','r') as f:
    
    for l in f:
        line_list = l.split(' ')
        
        for num in line_list:
            count_list[int(num)] = count_list[int(num)] + 1
            
for i in xrange(len(count_list)):
    print 'Number {} appears {} times'.format(i, count_list[i])
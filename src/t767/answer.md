当某个字符的出现次数大于字符总数的一半时，必然无法进行重构，返回空字符串。先将字符串中的每个字符按照26个字母的排序进行放置形成数组，出现次数作为数组的元素。
遍历数组，将字符串中的字符按照奇数偶数放在新建的char数组中。将相同的字符个数小于字符串长度的一半的字符放在奇数下标位置，否则放在偶数下标位置。
注意这里需要判断奇数位置是否大于字符串长度。
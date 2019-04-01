[997. 找到小镇的法官](https://leetcode-cn.com/problems/find-the-town-judge/)

用一个二维数组表示小镇中的每个人，二维数组的每一项都是一个长度为2的一维数组，分别表示相信他的人和他相信的人（即出入度），根据题目条件，只要相信他的人的个数为N-1以及他相信的人的个数为0即为法官，如果没有，返回-1
```text
public int findJudge(int N, int[][] trust) {
    int[][] people = new int[N][2];
    for (int[] person : trust) {
        int out = person[0];
        int in = person[1];
        people[out - 1][0]++;
        people[in - 1][1]++;
    }
    for (int i = 0; i < N; i++) {
        if (people[i][0] == 0 && people[i][1] == N - 1)
            return i + 1;
    }
    return -1;
}
```
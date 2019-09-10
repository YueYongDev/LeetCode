package t797;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[][] graph = {{1, 2}, {3}, {3}, {}};
        List<List<Integer>> answer = new Main().allPathsSourceTarget(graph);
        for (List<Integer> list : answer) {
            for (int i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private List<List<Integer>> ans;
    private int[][] graph;

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        this.ans = new ArrayList<>();
        this.graph = graph;
        boolean[] visit = new boolean[graph.length];
        List<Integer> path = new ArrayList<>();
        dfs(0, path, visit);
        return ans;
    }

    private void dfs(int pos, List<Integer> path, boolean[] visit) {
        int end = graph.length;
        // 在路径中添加该节点
        path.add(pos);
        // 表示节点pos已经被访问
        visit[pos] = true;

        if (pos == end - 1) {
            // 到达终点将结果存入ans
            ans.add(new ArrayList<>(path));
        } else {
            // 搜寻下一步所要走的节点
            for (int i : graph[pos]) {
                if (!visit[i]) {
                    dfs(i, path, visit);
                }
            }
        }

        path.remove(path.size() - 1);
        visit[pos] = false;
    }
}

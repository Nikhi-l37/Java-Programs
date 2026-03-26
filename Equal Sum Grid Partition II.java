class Solution:
    def canPartitionGrid(self, g: List[List[int]]) -> bool:
        for g in g,[*zip(*g)],g[::-1],[*zip(*g)][::-1]:
            n,diff,z = len(g[0]),0-sum(chain(*g)),set()
            for i,r,_ in zip(count(),g,map(z.update,g)):
                diff += 2*sum(r)
                if diff in z and (diff in (g[0][0],r[0]),i>0 or diff in (r[0],r[-1]))[n>1] \
                    or diff==0: return True
        
        return False

import java.util.ArrayList;
import java.util.List;

class Fancy {
    private List<Long> nums;
    private long add = 0;
    private long mult = 1;
    private static final int MOD = 1_000_000_007;

    public Fancy() {
        nums = new ArrayList<>();
    }

    public void append(int val) {
        // We store the value as (val - current_add) / current_mult
        // This ensures that applying current_mult and current_add later recovers 'val'
        long effectiveVal = (val - add + MOD) % MOD;
        effectiveVal = (effectiveVal * power(mult, MOD - 2)) % MOD;
        nums.add(effectiveVal);
    }

    public void addAll(int inc) {
        add = (add + inc) % MOD;
    }

    public void multAll(int m) {
        add = (add * m) % MOD;
        mult = (mult * m) % MOD;
    }

    public int getIndex(int idx) {
        if (idx >= nums.size()) return -1;
        // Result = (stored_val * current_mult) + current_add
        long res = (nums.get(idx) * mult) % MOD;
        res = (res + add) % MOD;
        return (int) res;
    }

    // Binary Exponentiation for Modular Inverse
    private long power(long base, long exp) {
        long res = 1;
        base %= MOD;
        while (exp > 0) {
            if (exp % 2 == 1) res = (res * base) % MOD;
            base = (base * base) % MOD;
            exp /= 2;
        }
        return res;
    }
}

package M2;

import O2.n;
import O2.o;
import Y1.k;
import com.google.android.gms.common.api.Api;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f3474a;

    private static class a implements b {
        @Override // M2.g.b
        public List a() {
            return Collections.EMPTY_LIST;
        }

        @Override // M2.g.b
        public int b() {
            return 0;
        }

        private a() {
        }
    }

    public interface b {
        List a();

        int b();
    }

    public g() {
        this(new a());
    }

    @Override // M2.e
    public int a(int i10) {
        List listA = this.f3474a.a();
        if (listA == null || listA.isEmpty()) {
            return i10 + 1;
        }
        for (int i11 = 0; i11 < listA.size(); i11++) {
            if (((Integer) listA.get(i11)).intValue() > i10) {
                return ((Integer) listA.get(i11)).intValue();
            }
        }
        return Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    @Override // M2.e
    public o b(int i10) {
        return n.d(i10, i10 >= this.f3474a.b(), false);
    }

    @Override // M2.e
    public boolean c() {
        return true;
    }

    public g(b bVar) {
        this.f3474a = (b) k.g(bVar);
    }
}

package u9;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes3.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Method f50068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ThreadMode f50069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Class f50070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f50071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f50072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f50073f;

    public o(Method method, Class cls, ThreadMode threadMode, int i10, boolean z9) {
        this.f50068a = method;
        this.f50069b = threadMode;
        this.f50070c = cls;
        this.f50071d = i10;
        this.f50072e = z9;
    }

    private synchronized void a() {
        if (this.f50073f == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f50068a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f50068a.getName());
            sb.append('(');
            sb.append(this.f50070c.getName());
            this.f50073f = sb.toString();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        a();
        o oVar = (o) obj;
        oVar.a();
        return this.f50073f.equals(oVar.f50073f);
    }

    public int hashCode() {
        return this.f50068a.hashCode();
    }
}

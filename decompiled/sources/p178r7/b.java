package p178r7;

import android.view.View;
import java.util.Iterator;
import p158p7.l;

/* JADX INFO: loaded from: classes3.dex */
public class b extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static b f48355d = new b();

    private b() {
    }

    public static b k() {
        return f48355d;
    }

    @Override // p178r7.d
    public void f(boolean z9) {
        Iterator it = c.e().c().iterator();
        while (it.hasNext()) {
            ((l) it.next()).p().k(z9);
        }
    }

    @Override // p178r7.d
    public boolean h() {
        Iterator it = c.e().a().iterator();
        while (it.hasNext()) {
            View viewH = ((l) it.next()).h();
            if (viewH != null && viewH.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}

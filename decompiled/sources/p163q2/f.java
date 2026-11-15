package p163q2;

import android.graphics.drawable.Animatable;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f48039a = new ArrayList(2);

    private synchronized void d(String str, Throwable th) {
        Log.e("FdingControllerListener", str, th);
    }

    @Override // p163q2.d
    public void a(String str, Object obj) {
        int size = this.f48039a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                d dVar = (d) this.f48039a.get(i10);
                if (dVar != null) {
                    dVar.a(str, obj);
                }
            } catch (Exception e10) {
                d("InternalListener exception in onIntermediateImageSet", e10);
            }
        }
    }

    public synchronized void b(d dVar) {
        this.f48039a.add(dVar);
    }

    public synchronized void c() {
        this.f48039a.clear();
    }

    @Override // p163q2.d
    public synchronized void f(String str, Throwable th) {
        int size = this.f48039a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                d dVar = (d) this.f48039a.get(i10);
                if (dVar != null) {
                    dVar.f(str, th);
                }
            } catch (Exception e10) {
                d("InternalListener exception in onFailure", e10);
            }
        }
    }

    @Override // p163q2.d
    public synchronized void g(String str) {
        int size = this.f48039a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                d dVar = (d) this.f48039a.get(i10);
                if (dVar != null) {
                    dVar.g(str);
                }
            } catch (Exception e10) {
                d("InternalListener exception in onRelease", e10);
            }
        }
    }

    @Override // p163q2.d
    public synchronized void m(String str, Object obj, Animatable animatable) {
        int size = this.f48039a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                d dVar = (d) this.f48039a.get(i10);
                if (dVar != null) {
                    dVar.m(str, obj, animatable);
                }
            } catch (Exception e10) {
                d("InternalListener exception in onFinalImageSet", e10);
            }
        }
    }

    @Override // p163q2.d
    public synchronized void q(String str, Object obj) {
        int size = this.f48039a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                d dVar = (d) this.f48039a.get(i10);
                if (dVar != null) {
                    dVar.q(str, obj);
                }
            } catch (Exception e10) {
                d("InternalListener exception in onSubmit", e10);
            }
        }
    }

    @Override // p163q2.d
    public void r(String str, Throwable th) {
        int size = this.f48039a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                d dVar = (d) this.f48039a.get(i10);
                if (dVar != null) {
                    dVar.r(str, th);
                }
            } catch (Exception e10) {
                d("InternalListener exception in onIntermediateImageFailed", e10);
            }
        }
    }
}

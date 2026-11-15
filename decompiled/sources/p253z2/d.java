package p253z2;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class d extends p253z2.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f50913d = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f50914c = new ArrayList(2);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final synchronized void G(b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f50914c.remove(listener);
    }

    @Override // p253z2.a, p253z2.b
    public void a(String id, Object obj) {
        Intrinsics.checkNotNullParameter(id, "id");
        int size = this.f50914c.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((b) this.f50914c.get(i10)).a(id, obj);
                    Unit unit = Unit.f45918a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onIntermediateImageSet", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // p253z2.a, p253z2.b
    public void c(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        int size = this.f50914c.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((b) this.f50914c.get(i10)).c(id);
                    Unit unit = Unit.f45918a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onIntermediateImageFailed", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // p253z2.a, p253z2.b
    public void h(String id, b.a aVar) {
        Intrinsics.checkNotNullParameter(id, "id");
        int size = this.f50914c.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((b) this.f50914c.get(i10)).h(id, aVar);
                    Unit unit = Unit.f45918a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onRelease", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // p253z2.a, p253z2.b
    public void j(String id, Throwable th, b.a aVar) {
        Intrinsics.checkNotNullParameter(id, "id");
        int size = this.f50914c.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((b) this.f50914c.get(i10)).j(id, th, aVar);
                    Unit unit = Unit.f45918a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onFailure", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // p253z2.a, p253z2.b
    public void v(String id, Object obj, b.a aVar) {
        Intrinsics.checkNotNullParameter(id, "id");
        int size = this.f50914c.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((b) this.f50914c.get(i10)).v(id, obj, aVar);
                    Unit unit = Unit.f45918a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onFinalImageSet", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // p253z2.a, p253z2.b
    public void w(String id, Object obj, b.a aVar) {
        Intrinsics.checkNotNullParameter(id, "id");
        int size = this.f50914c.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((b) this.f50914c.get(i10)).w(id, obj, aVar);
                    Unit unit = Unit.f45918a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onSubmit", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    public final synchronized void x(b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f50914c.add(listener);
    }
}

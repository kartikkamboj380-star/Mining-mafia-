package R2;

import com.facebook.imagepipeline.memory.AshmemMemoryChunkPool;
import com.facebook.imagepipeline.memory.BufferMemoryChunkPool;
import com.facebook.imagepipeline.memory.NativeMemoryChunkPool;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C f5114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.facebook.imagepipeline.memory.e f5115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i f5116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.facebook.imagepipeline.memory.e f5117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.facebook.imagepipeline.memory.e f5118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p013b2.i f5119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p013b2.l f5120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private p013b2.a f5121h;

    public E(C c10) {
        this.f5114a = (C) Y1.k.g(c10);
    }

    private com.facebook.imagepipeline.memory.e a() {
        if (this.f5115b == null) {
            try {
                this.f5115b = (com.facebook.imagepipeline.memory.e) AshmemMemoryChunkPool.class.getConstructor(p013b2.d.class, F.class, G.class).newInstance(this.f5114a.i(), this.f5114a.g(), this.f5114a.h());
            } catch (ClassNotFoundException unused) {
                this.f5115b = null;
            } catch (IllegalAccessException unused2) {
                this.f5115b = null;
            } catch (InstantiationException unused3) {
                this.f5115b = null;
            } catch (NoSuchMethodException unused4) {
                this.f5115b = null;
            } catch (InvocationTargetException unused5) {
                this.f5115b = null;
            }
        }
        return this.f5115b;
    }

    private com.facebook.imagepipeline.memory.e e(int i10) {
        if (i10 == 0) {
            return f();
        }
        if (i10 == 1) {
            return c();
        }
        if (i10 == 2) {
            return a();
        }
        throw new IllegalArgumentException("Invalid MemoryChunkType");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    public i b() {
        byte b10;
        if (this.f5116c == null) {
            switch (this.f5114a.e()) {
                case "legacy_default_params":
                    b10 = 3;
                    break;
                case "legacy":
                    b10 = 4;
                    break;
                case "experimental":
                    b10 = 2;
                    break;
                case "dummy_with_tracking":
                    b10 = 1;
                    break;
                case "dummy":
                    b10 = 0;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            if (b10 == 0) {
                this.f5116c = new r();
            } else if (b10 == 1) {
                this.f5116c = new s();
            } else if (b10 == 2) {
                this.f5116c = new u(this.f5114a.b(), this.f5114a.a(), A.h(), this.f5114a.m() ? this.f5114a.i() : null);
            } else if (b10 != 3) {
                this.f5116c = new com.facebook.imagepipeline.memory.c(this.f5114a.i(), this.f5114a.c(), this.f5114a.d(), this.f5114a.l());
            } else {
                this.f5116c = new com.facebook.imagepipeline.memory.c(this.f5114a.i(), n.a(), this.f5114a.d(), this.f5114a.l());
            }
        }
        return this.f5116c;
    }

    public com.facebook.imagepipeline.memory.e c() {
        if (this.f5117d == null) {
            try {
                this.f5117d = (com.facebook.imagepipeline.memory.e) BufferMemoryChunkPool.class.getConstructor(p013b2.d.class, F.class, G.class).newInstance(this.f5114a.i(), this.f5114a.g(), this.f5114a.h());
            } catch (ClassNotFoundException unused) {
                this.f5117d = null;
            } catch (IllegalAccessException unused2) {
                this.f5117d = null;
            } catch (InstantiationException unused3) {
                this.f5117d = null;
            } catch (NoSuchMethodException unused4) {
                this.f5117d = null;
            } catch (InvocationTargetException unused5) {
                this.f5117d = null;
            }
        }
        return this.f5117d;
    }

    public int d() {
        return this.f5114a.f().f5128g;
    }

    public com.facebook.imagepipeline.memory.e f() {
        if (this.f5118e == null) {
            try {
                this.f5118e = (com.facebook.imagepipeline.memory.e) NativeMemoryChunkPool.class.getConstructor(p013b2.d.class, F.class, G.class).newInstance(this.f5114a.i(), this.f5114a.g(), this.f5114a.h());
            } catch (ClassNotFoundException e10) {
                Z1.a.n("PoolFactory", "", e10);
                this.f5118e = null;
            } catch (IllegalAccessException e11) {
                Z1.a.n("PoolFactory", "", e11);
                this.f5118e = null;
            } catch (InstantiationException e12) {
                Z1.a.n("PoolFactory", "", e12);
                this.f5118e = null;
            } catch (NoSuchMethodException e13) {
                Z1.a.n("PoolFactory", "", e13);
                this.f5118e = null;
            } catch (InvocationTargetException e14) {
                Z1.a.n("PoolFactory", "", e14);
                this.f5118e = null;
            }
        }
        return this.f5118e;
    }

    public p013b2.i g(int i10) {
        if (this.f5119f == null) {
            com.facebook.imagepipeline.memory.e eVarE = e(i10);
            Y1.k.h(eVarE, "failed to get pool for chunk type: " + i10);
            this.f5119f = new z(eVarE, h());
        }
        return this.f5119f;
    }

    public p013b2.l h() {
        if (this.f5120g == null) {
            this.f5120g = new p013b2.l(i());
        }
        return this.f5120g;
    }

    public p013b2.a i() {
        if (this.f5121h == null) {
            this.f5121h = new com.facebook.imagepipeline.memory.d(this.f5114a.i(), this.f5114a.j(), this.f5114a.k());
        }
        return this.f5121h;
    }
}

package M2;

import O2.j;
import Y1.k;
import Y1.p;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f3472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p013b2.a f3473h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3468c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3467b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3469d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f3471f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3470e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f3466a = 0;

    public f(p013b2.a aVar) {
        this.f3473h = (p013b2.a) k.g(aVar);
    }

    private boolean a(InputStream inputStream) throws Throwable {
        int i10;
        int i11 = this.f3470e;
        while (this.f3466a != 6 && (i10 = inputStream.read()) != -1) {
            try {
                int i12 = this.f3468c;
                this.f3468c = i12 + 1;
                if (this.f3472g) {
                    this.f3466a = 6;
                    this.f3472g = false;
                    return false;
                }
                int i13 = this.f3466a;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 != 3) {
                                if (i13 == 4) {
                                    this.f3466a = 5;
                                } else if (i13 != 5) {
                                    k.i(false);
                                } else {
                                    int i14 = ((this.f3467b << 8) + i10) - 2;
                                    p063g2.d.a(inputStream, i14);
                                    this.f3468c += i14;
                                    this.f3466a = 2;
                                }
                            } else if (i10 == 255) {
                                this.f3466a = 3;
                            } else if (i10 == 0) {
                                this.f3466a = 2;
                            } else if (i10 == 217) {
                                this.f3472g = true;
                                f(i12 - 1);
                                this.f3466a = 2;
                            } else {
                                if (i10 == 218) {
                                    f(i12 - 1);
                                }
                                if (b(i10)) {
                                    this.f3466a = 4;
                                } else {
                                    this.f3466a = 2;
                                }
                            }
                        } else if (i10 == 255) {
                            this.f3466a = 3;
                        }
                    } else if (i10 == 216) {
                        this.f3466a = 2;
                    } else {
                        this.f3466a = 6;
                    }
                } else if (i10 == 255) {
                    this.f3466a = 1;
                } else {
                    this.f3466a = 6;
                }
                this.f3467b = i10;
            } catch (IOException e10) {
                p.a(e10);
            }
        }
        return (this.f3466a == 6 || this.f3470e == i11) ? false : true;
    }

    private static boolean b(int i10) {
        if (i10 == 1) {
            return false;
        }
        return ((i10 >= 208 && i10 <= 215) || i10 == 217 || i10 == 216) ? false : true;
    }

    private void f(int i10) {
        int i11 = this.f3469d;
        if (i11 > 0) {
            this.f3471f = i10;
        }
        this.f3469d = i11 + 1;
        this.f3470e = i11;
    }

    public int c() {
        return this.f3471f;
    }

    public int d() {
        return this.f3470e;
    }

    public boolean e() {
        return this.f3472g;
    }

    public boolean g(j jVar) {
        if (this.f3466a == 6 || jVar.Q() <= this.f3468c) {
            return false;
        }
        p013b2.g gVar = new p013b2.g(jVar.M(), (byte[]) this.f3473h.get(16384), this.f3473h);
        try {
            p063g2.d.a(gVar, this.f3468c);
            return a(gVar);
        } catch (IOException e10) {
            p.a(e10);
            return false;
        } finally {
            Y1.b.b(gVar);
        }
    }
}

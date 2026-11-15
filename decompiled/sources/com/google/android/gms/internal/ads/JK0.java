package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class JK0 extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Comparator f19833i = new BK0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparator f19834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f19835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    IK0 f19836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f19837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f19838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final IK0 f19839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private DK0 f19840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private FK0 f19841h;

    public JK0(Comparator comparator, boolean z9) {
        this.f19837d = 0;
        this.f19838e = 0;
        this.f19834a = comparator;
        this.f19835b = z9;
        this.f19839f = new IK0(z9);
    }

    private final void g(IK0 ik0, IK0 ik1) {
        IK0 ik2 = ik0.f19519a;
        ik0.f19519a = null;
        if (ik1 != null) {
            ik1.f19519a = ik2;
        }
        if (ik2 == null) {
            this.f19836c = ik1;
        } else if (ik2.f19520b == ik0) {
            ik2.f19520b = ik1;
        } else {
            ik2.f19521c = ik1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0080 A[SYNTHETIC] */
    private final void h(IK0 ik0, boolean z9) {
        while (ik0 != null) {
            IK0 ik1 = ik0.f19520b;
            IK0 ik2 = ik0.f19521c;
            boolean z10 = false;
            int i10 = ik1 != null ? ik1.f19527i : 0;
            int i11 = ik2 != null ? ik2.f19527i : 0;
            int i12 = i10 - i11;
            boolean z11 = true;
            if (i12 == -2) {
                IK0 ik3 = ik2.f19520b;
                IK0 ik4 = ik2.f19521c;
                int i13 = (ik3 != null ? ik3.f19527i : 0) - (ik4 != null ? ik4.f19527i : 0);
                if (i13 != -1) {
                    if (i13 == 0) {
                        if (!z9) {
                        }
                        if (z11) {
                            return;
                        }
                    } else {
                        z11 = z9;
                    }
                    j(ik2);
                    i(ik0);
                    if (z11) {
                        return;
                    }
                } else {
                    z10 = z9;
                }
                i(ik0);
                z11 = z10;
                if (z11) {
                    return;
                }
            } else if (i12 == 2) {
                IK0 ik5 = ik1.f19520b;
                IK0 ik6 = ik1.f19521c;
                int i14 = (ik5 != null ? ik5.f19527i : 0) - (ik6 != null ? ik6.f19527i : 0);
                if (i14 != 1) {
                    if (i14 == 0) {
                        if (!z9) {
                        }
                        if (z11) {
                            return;
                        }
                    } else {
                        z11 = z9;
                    }
                    i(ik1);
                    j(ik0);
                    if (z11) {
                        return;
                    }
                } else {
                    z10 = z9;
                }
                j(ik0);
                z11 = z10;
                if (z11) {
                    return;
                }
            } else if (i12 == 0) {
                ik0.f19527i = i10 + 1;
                if (z9) {
                    return;
                }
            } else {
                ik0.f19527i = Math.max(i10, i11) + 1;
                if (!z9) {
                    return;
                }
            }
            ik0 = ik0.f19519a;
        }
    }

    private final void i(IK0 ik0) {
        IK0 ik1 = ik0.f19520b;
        IK0 ik2 = ik0.f19521c;
        IK0 ik3 = ik2.f19520b;
        IK0 ik4 = ik2.f19521c;
        ik0.f19521c = ik3;
        if (ik3 != null) {
            ik3.f19519a = ik0;
        }
        g(ik0, ik2);
        ik2.f19520b = ik0;
        ik0.f19519a = ik2;
        int iMax = Math.max(ik1 != null ? ik1.f19527i : 0, ik3 != null ? ik3.f19527i : 0) + 1;
        ik0.f19527i = iMax;
        ik2.f19527i = Math.max(iMax, ik4 != null ? ik4.f19527i : 0) + 1;
    }

    private final void j(IK0 ik0) {
        IK0 ik1 = ik0.f19520b;
        IK0 ik2 = ik0.f19521c;
        IK0 ik3 = ik1.f19520b;
        IK0 ik4 = ik1.f19521c;
        ik0.f19520b = ik4;
        if (ik4 != null) {
            ik4.f19519a = ik0;
        }
        g(ik0, ik1);
        ik1.f19521c = ik0;
        ik0.f19519a = ik1;
        int iMax = Math.max(ik2 != null ? ik2.f19527i : 0, ik4 != null ? ik4.f19527i : 0) + 1;
        ik0.f19527i = iMax;
        ik1.f19527i = Math.max(iMax, ik3 != null ? ik3.f19527i : 0) + 1;
    }

    final IK0 a(Object obj, boolean z9) {
        int iCompareTo;
        IK0 ik0;
        Comparator comparator = this.f19834a;
        IK0 ik1 = this.f19836c;
        if (ik1 != null) {
            Comparable comparable = comparator == f19833i ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(ik1.f19524f) : comparator.compare(obj, ik1.f19524f);
                if (iCompareTo == 0) {
                    return ik1;
                }
                IK0 ik2 = iCompareTo < 0 ? ik1.f19520b : ik1.f19521c;
                if (ik2 == null) {
                    break;
                }
                ik1 = ik2;
            }
        } else {
            iCompareTo = 0;
        }
        int i10 = iCompareTo;
        if (!z9) {
            return null;
        }
        IK0 ik3 = this.f19839f;
        if (ik1 != null) {
            IK0 ik4 = ik1;
            ik0 = new IK0(this.f19835b, ik4, obj, ik3, ik3.f19523e);
            if (i10 < 0) {
                ik4.f19520b = ik0;
            } else {
                ik4.f19521c = ik0;
            }
            h(ik4, true);
        } else {
            if (comparator == f19833i && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            ik0 = new IK0(this.f19835b, null, obj, ik3, ik3.f19523e);
            this.f19836c = ik0;
        }
        this.f19837d++;
        this.f19838e++;
        return ik0;
    }

    final IK0 b(Object obj) {
        if (obj != null) {
            try {
                return a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    final IK0 c(Map.Entry entry) {
        IK0 ik0B = b(entry.getKey());
        if (ik0B == null || !Objects.equals(ik0B.f19526h, entry.getValue())) {
            return null;
        }
        return ik0B;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f19836c = null;
        this.f19837d = 0;
        this.f19838e++;
        IK0 ik0 = this.f19839f;
        ik0.f19523e = ik0;
        ik0.f19522d = ik0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return b(obj) != null;
    }

    final void e(IK0 ik0, boolean z9) {
        IK0 ik1;
        IK0 ik2;
        int i10;
        if (z9) {
            IK0 ik3 = ik0.f19523e;
            ik3.f19522d = ik0.f19522d;
            ik0.f19522d.f19523e = ik3;
        }
        IK0 ik4 = ik0.f19520b;
        IK0 ik5 = ik0.f19521c;
        IK0 ik6 = ik0.f19519a;
        int i11 = 0;
        if (ik4 == null || ik5 == null) {
            if (ik4 != null) {
                g(ik0, ik4);
                ik0.f19520b = null;
            } else if (ik5 != null) {
                g(ik0, ik5);
                ik0.f19521c = null;
            } else {
                g(ik0, null);
            }
            h(ik6, false);
            this.f19837d--;
            this.f19838e++;
            return;
        }
        if (ik4.f19527i > ik5.f19527i) {
            do {
                ik2 = ik4;
                ik4 = ik4.f19521c;
            } while (ik4 != null);
        } else {
            do {
                ik1 = ik5;
                ik5 = ik5.f19520b;
            } while (ik5 != null);
            ik2 = ik1;
        }
        e(ik2, false);
        IK0 ik7 = ik0.f19520b;
        if (ik7 != null) {
            i10 = ik7.f19527i;
            ik2.f19520b = ik7;
            ik7.f19519a = ik2;
            ik0.f19520b = null;
        } else {
            i10 = 0;
        }
        IK0 ik8 = ik0.f19521c;
        if (ik8 != null) {
            i11 = ik8.f19527i;
            ik2.f19521c = ik8;
            ik8.f19519a = ik2;
            ik0.f19521c = null;
        }
        ik2.f19527i = Math.max(i10, i11) + 1;
        g(ik0, ik2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        DK0 dk0 = this.f19840g;
        if (dk0 != null) {
            return dk0;
        }
        DK0 dk1 = new DK0(this);
        this.f19840g = dk1;
        return dk1;
    }

    final IK0 f(Object obj) {
        IK0 ik0B = b(obj);
        if (ik0B != null) {
            e(ik0B, true);
        }
        return ik0B;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        IK0 ik0B = b(obj);
        if (ik0B != null) {
            return ik0B.f19526h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        FK0 fk0 = this.f19841h;
        if (fk0 != null) {
            return fk0;
        }
        FK0 fk1 = new FK0(this);
        this.f19841h = fk1;
        return fk1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f19835b) {
            throw new NullPointerException("value == null");
        }
        IK0 ik0A = a(obj, true);
        Object obj3 = ik0A.f19526h;
        ik0A.f19526h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        IK0 ik0F = f(obj);
        if (ik0F != null) {
            return ik0F.f19526h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f19837d;
    }

    public JK0(boolean z9) {
        this(f19833i, false);
    }
}

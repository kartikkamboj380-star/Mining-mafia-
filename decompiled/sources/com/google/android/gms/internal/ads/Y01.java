package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class Y01 extends C3771hk {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final Y01 f25437a0 = new Y01(new X01());

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final boolean f25438J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final boolean f25439K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final boolean f25440L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final boolean f25441M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final boolean f25442N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final boolean f25443O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final boolean f25444P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final boolean f25445Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final boolean f25446R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final boolean f25447S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final boolean f25448T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final boolean f25449U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final boolean f25450V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final boolean f25451W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final boolean f25452X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private final SparseArray f25453Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final SparseBooleanArray f25454Z;

    static {
        String str = AbstractC4634ob0.f32117a;
        Integer.toString(1000, 36);
        Integer.toString(BackupConstant.SCENE_RENDER_FAIL, 36);
        Integer.toString(BackupConstant.SCENE_BACKUP_RENDER_FAIL, 36);
        Integer.toString(BackupConstant.SCENE_CLOSED_WITHOUT_SHOW, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(TTAdConstant.IMAGE_MODE_1010, 36);
        Integer.toString(TTAdConstant.IMAGE_MODE_1011, 36);
        Integer.toString(TTAdConstant.IMAGE_MODE_1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
        Integer.toString(1017, 36);
        Integer.toString(1018, 36);
    }

    /* synthetic */ Y01(X01 x01, byte[] bArr) {
        this(x01);
    }

    public final boolean a(int i10) {
        return this.f25454Z.get(i10);
    }

    public final boolean b(int i10, A01 a01) {
        Map map = (Map) this.f25453Y.get(i10);
        return map != null && map.containsKey(a01);
    }

    public final Z01 c(int i10, A01 a01) {
        Map map = (Map) this.f25453Y.get(i10);
        if (map != null) {
            p070h.w.a(map.get(a01));
        }
        return null;
    }

    public final X01 d() {
        return new X01(this, null);
    }

    final /* synthetic */ SparseArray e() {
        return this.f25453Y;
    }

    @Override // com.google.android.gms.internal.ads.C3771hk
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Y01.class == obj.getClass()) {
            Y01 y01 = (Y01) obj;
            if (super.equals(y01) && this.f25438J == y01.f25438J && this.f25440L == y01.f25440L && this.f25442N == y01.f25442N && this.f25447S == y01.f25447S && this.f25448T == y01.f25448T && this.f25449U == y01.f25449U && this.f25451W == y01.f25451W) {
                SparseBooleanArray sparseBooleanArray = this.f25454Z;
                SparseBooleanArray sparseBooleanArray2 = y01.f25454Z;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = this.f25453Y;
                    SparseArray sparseArray2 = y01.f25453Y;
                    int size2 = sparseArray.size();
                    if (sparseArray2.size() == size2) {
                        for (int i11 = 0; i11 < size2; i11++) {
                            int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i11));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray.valueAt(i11);
                                Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        A01 a01 = (A01) entry.getKey();
                                        if (!map2.containsKey(a01) || !Objects.equals(entry.getValue(), map2.get(a01))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    final /* synthetic */ SparseBooleanArray f() {
        return this.f25454Z;
    }

    @Override // com.google.android.gms.internal.ads.C3771hk
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f25438J ? 1 : 0)) * 961) + (this.f25440L ? 1 : 0)) * 961) + (this.f25442N ? 1 : 0)) * 28629151) + (this.f25447S ? 1 : 0)) * 31) + (this.f25448T ? 1 : 0)) * 31) + (this.f25449U ? 1 : 0)) * 961) + (this.f25451W ? 1 : 0)) * 31;
    }

    private Y01(X01 x01) {
        super(x01);
        this.f25438J = x01.I();
        this.f25439K = false;
        this.f25440L = x01.y();
        this.f25441M = false;
        this.f25442N = x01.z();
        this.f25443O = false;
        this.f25444P = false;
        this.f25445Q = false;
        this.f25446R = false;
        this.f25447S = x01.A();
        this.f25448T = x01.B();
        this.f25449U = x01.C();
        this.f25450V = false;
        this.f25451W = x01.D();
        this.f25452X = false;
        this.f25453Y = x01.E();
        this.f25454Z = x01.F();
    }
}

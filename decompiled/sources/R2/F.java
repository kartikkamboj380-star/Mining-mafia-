package R2;

import android.util.SparseIntArray;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
public class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseIntArray f5124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5128g;

    public F(int i10, int i11, SparseIntArray sparseIntArray) {
        this(i10, i11, sparseIntArray, 0, Api.BaseClientBuilder.API_PRIORITY_OTHER, -1);
    }

    public F(int i10, int i11, SparseIntArray sparseIntArray, int i12, int i13, int i14) {
        Y1.k.i(i10 >= 0 && i11 >= i10);
        this.f5123b = i10;
        this.f5122a = i11;
        this.f5124c = sparseIntArray;
        this.f5125d = i12;
        this.f5126e = i13;
        this.f5128g = i14;
    }
}

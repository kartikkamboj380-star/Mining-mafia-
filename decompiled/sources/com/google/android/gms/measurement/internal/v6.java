package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class v6 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<v6> CREATOR = new w6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f38433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f38434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f38435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f38436f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f38437g;

    v6(int i10, String str, long j10, Long l10, Float f10, String str2, String str3, Double d10) {
        this.f38431a = i10;
        this.f38432b = str;
        this.f38433c = j10;
        this.f38434d = l10;
        this.f38437g = i10 == 1 ? f10 != null ? Double.valueOf(f10.doubleValue()) : null : d10;
        this.f38435e = str2;
        this.f38436f = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        w6.a(this, parcel, i10);
    }

    public final Object zza() {
        Long l10 = this.f38434d;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f38437g;
        if (d10 != null) {
            return d10;
        }
        String str = this.f38435e;
        if (str != null) {
            return str;
        }
        return null;
    }

    v6(x6 x6Var) {
        this(x6Var.f38538c, x6Var.f38539d, x6Var.f38540e, x6Var.f38537b);
    }

    v6(String str, long j10, Object obj, String str2) {
        Preconditions.checkNotEmpty(str);
        this.f38431a = 2;
        this.f38432b = str;
        this.f38433c = j10;
        this.f38436f = str2;
        if (obj == null) {
            this.f38434d = null;
            this.f38437g = null;
            this.f38435e = null;
            return;
        }
        if (obj instanceof Long) {
            this.f38434d = (Long) obj;
            this.f38437g = null;
            this.f38435e = null;
        } else if (obj instanceof String) {
            this.f38434d = null;
            this.f38437g = null;
            this.f38435e = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f38434d = null;
                this.f38437g = (Double) obj;
                this.f38435e = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}

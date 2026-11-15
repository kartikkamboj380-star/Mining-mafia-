package p036d5;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: renamed from: d5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6947a extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<C6947a> CREATOR = new C6950d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Intent f43089a;

    public C6947a(Intent intent) {
        this.f43089a = intent;
    }

    public Intent a() {
        return this.f43089a;
    }

    public String j() {
        String stringExtra = this.f43089a.getStringExtra("google.message_id");
        return stringExtra == null ? this.f43089a.getStringExtra("message_id") : stringExtra;
    }

    final Integer v() {
        if (this.f43089a.hasExtra("google.product_id")) {
            return Integer.valueOf(this.f43089a.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f43089a, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}

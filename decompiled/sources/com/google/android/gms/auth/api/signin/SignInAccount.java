package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "SignInAccountCreator")
@SafeParcelable.Reserved({1})
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInAccount> CREATOR = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f16961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GoogleSignInAccount f16962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f16963c;

    SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f16962b = googleSignInAccount;
        this.f16961a = Preconditions.checkNotEmpty(str, "8.3 and 8.4 SDKs require non-null email");
        this.f16963c = Preconditions.checkNotEmpty(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    public final GoogleSignInAccount a() {
        return this.f16962b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f16961a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 4, str, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f16962b, i10, false);
        SafeParcelWriter.writeString(parcel, 8, this.f16963c, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}

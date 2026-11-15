package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p016b5.b;
import p016b5.y;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "SignInConfigurationCreator")
@SafeParcelable.Reserved({1})
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GoogleSignInOptions f16967b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f16966a = Preconditions.checkNotEmpty(str);
        this.f16967b = googleSignInOptions;
    }

    public final GoogleSignInOptions a() {
        return this.f16967b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f16966a.equals(signInConfiguration.f16966a)) {
            GoogleSignInOptions googleSignInOptions = this.f16967b;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f16967b;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new b().a(this.f16966a).a(this.f16967b).b();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f16966a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f16967b, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}

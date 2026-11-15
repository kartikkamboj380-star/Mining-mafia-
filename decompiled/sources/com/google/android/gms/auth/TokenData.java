package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "TokenDataCreator")
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<TokenData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f16909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Long f16911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f16912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f16913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f16914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f16915g;

    TokenData(int i10, String str, Long l10, boolean z9, boolean z10, List list, String str2) {
        this.f16909a = i10;
        this.f16910b = Preconditions.checkNotEmpty(str);
        this.f16911c = l10;
        this.f16912d = z9;
        this.f16913e = z10;
        this.f16914f = list;
        this.f16915g = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.f16910b, tokenData.f16910b) && Objects.equal(this.f16911c, tokenData.f16911c) && this.f16912d == tokenData.f16912d && this.f16913e == tokenData.f16913e && Objects.equal(this.f16914f, tokenData.f16914f) && Objects.equal(this.f16915g, tokenData.f16915g);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f16910b, this.f16911c, Boolean.valueOf(this.f16912d), Boolean.valueOf(this.f16913e), this.f16914f, this.f16915g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f16909a);
        SafeParcelWriter.writeString(parcel, 2, this.f16910b, false);
        SafeParcelWriter.writeLongObject(parcel, 3, this.f16911c, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f16912d);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f16913e);
        SafeParcelWriter.writeStringList(parcel, 6, this.f16914f, false);
        SafeParcelWriter.writeString(parcel, 7, this.f16915g, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String zza() {
        return this.f16910b;
    }
}

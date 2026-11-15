package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "GoogleSignInAccountCreator")
@Deprecated
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new c();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Clock f16919v = DefaultClock.getInstance();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f16920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f16922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f16923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f16924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Uri f16925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f16926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f16927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f16928i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final List f16929j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f16930k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f16931l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set f16932m = new HashSet();

    GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, List list, String str7, String str8) {
        this.f16920a = i10;
        this.f16921b = str;
        this.f16922c = str2;
        this.f16923d = str3;
        this.f16924e = str4;
        this.f16925f = uri;
        this.f16926g = str5;
        this.f16927h = j10;
        this.f16928i = str6;
        this.f16929j = list;
        this.f16930k = str7;
        this.f16931l = str8;
    }

    public static GoogleSignInAccount R0(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l10, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l10.longValue(), Preconditions.checkNotEmpty(str7), new ArrayList((Collection) Preconditions.checkNotNull(set)), str5, str6);
    }

    public static GoogleSignInAccount V0(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j10 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        GoogleSignInAccount googleSignInAccountR0 = R0(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has(Scopes.EMAIL) ? jSONObject.optString(Scopes.EMAIL) : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, uri, Long.valueOf(j10), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountR0.f16926g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccountR0;
    }

    public boolean I0() {
        return f16919v.currentTimeMillis() / 1000 >= this.f16927h + (-300);
    }

    public String J() {
        return this.f16930k;
    }

    public Set N() {
        return new HashSet(this.f16929j);
    }

    public String Q() {
        return this.f16921b;
    }

    public String S() {
        return this.f16922c;
    }

    public Uri T() {
        return this.f16925f;
    }

    public Set W() {
        HashSet hashSet = new HashSet(this.f16929j);
        hashSet.addAll(this.f16932m);
        return hashSet;
    }

    public String a() {
        return this.f16924e;
    }

    public String a0() {
        return this.f16926g;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f16928i.equals(this.f16928i) && googleSignInAccount.W().equals(W());
    }

    public final String g1() {
        return this.f16928i;
    }

    public Account getAccount() {
        String str = this.f16923d;
        if (str == null) {
            return null;
        }
        return new Account(str, AccountType.GOOGLE);
    }

    public int hashCode() {
        return ((this.f16928i.hashCode() + 527) * 31) + W().hashCode();
    }

    public String j() {
        return this.f16923d;
    }

    public final String l1() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (Q() != null) {
                jSONObject.put("id", Q());
            }
            if (S() != null) {
                jSONObject.put("tokenId", S());
            }
            if (j() != null) {
                jSONObject.put(Scopes.EMAIL, j());
            }
            if (a() != null) {
                jSONObject.put("displayName", a());
            }
            if (J() != null) {
                jSONObject.put("givenName", J());
            }
            if (v() != null) {
                jSONObject.put("familyName", v());
            }
            Uri uriT = T();
            if (uriT != null) {
                jSONObject.put("photoUrl", uriT.toString());
            }
            if (a0() != null) {
                jSONObject.put("serverAuthCode", a0());
            }
            jSONObject.put("expirationTime", this.f16927h);
            jSONObject.put("obfuscatedIdentifier", this.f16928i);
            JSONArray jSONArray = new JSONArray();
            List list = this.f16929j;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: a5.d
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).getScopeUri().compareTo(((Scope) obj2).getScopeUri());
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.getScopeUri());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String v() {
        return this.f16931l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f16920a);
        SafeParcelWriter.writeString(parcel, 2, Q(), false);
        SafeParcelWriter.writeString(parcel, 3, S(), false);
        SafeParcelWriter.writeString(parcel, 4, j(), false);
        SafeParcelWriter.writeString(parcel, 5, a(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, T(), i10, false);
        SafeParcelWriter.writeString(parcel, 7, a0(), false);
        SafeParcelWriter.writeLong(parcel, 8, this.f16927h);
        SafeParcelWriter.writeString(parcel, 9, this.f16928i, false);
        SafeParcelWriter.writeTypedList(parcel, 10, this.f16929j, false);
        SafeParcelWriter.writeString(parcel, 11, J(), false);
        SafeParcelWriter.writeString(parcel, 12, v(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}

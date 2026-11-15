package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "GoogleSignInOptionsCreator")
@Deprecated
public class GoogleSignInOptions extends AbstractSafeParcelable implements Api.ApiOptions.Optional, ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final Scope f16934H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final Scope f16935I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final Comparator f16936J;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final GoogleSignInOptions f16937l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final GoogleSignInOptions f16938m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f16941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f16942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Account f16943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f16944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f16945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f16946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f16947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f16948h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f16949i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f16950j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map f16951k;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Scope f16939v = new Scope(Scopes.PROFILE);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Scope f16940w = new Scope(Scopes.EMAIL);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final Scope f16933G = new Scope(Scopes.OPEN_ID);

    static {
        Scope scope = new Scope(Scopes.GAMES_LITE);
        f16934H = scope;
        f16935I = new Scope(Scopes.GAMES);
        a aVar = new a();
        aVar.b();
        aVar.d();
        f16937l = aVar.a();
        a aVar2 = new a();
        aVar2.e(scope, new Scope[0]);
        f16938m = aVar2.a();
        CREATOR = new e();
        f16936J = new d();
    }

    public static GoogleSignInOptions W(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, AccountType.GOOGLE) : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map q1(List list) {
        HashMap map = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                p016b5.a aVar = (p016b5.a) it.next();
                map.put(Integer.valueOf(aVar.a()), aVar);
            }
        }
        return map;
    }

    public String J() {
        return this.f16947g;
    }

    public boolean N() {
        return this.f16946f;
    }

    public boolean Q() {
        return this.f16944d;
    }

    public boolean S() {
        return this.f16945e;
    }

    public final String V0() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f16942b, f16936J);
            ArrayList arrayList = this.f16942b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                jSONArray.put(((Scope) obj).getScopeUri());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f16943c;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f16944d);
            jSONObject.put("forceCodeForRefreshToken", this.f16946f);
            jSONObject.put("serverAuthRequested", this.f16945e);
            if (!TextUtils.isEmpty(this.f16947g)) {
                jSONObject.put("serverClientId", this.f16947g);
            }
            if (!TextUtils.isEmpty(this.f16948h)) {
                jSONObject.put("hostedDomain", this.f16948h);
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public ArrayList a() {
        return this.f16949i;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0052 A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:30:0x006a A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0072 A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            if (this.f16949i.isEmpty() && googleSignInOptions.f16949i.isEmpty() && this.f16942b.size() == googleSignInOptions.v().size() && this.f16942b.containsAll(googleSignInOptions.v())) {
                Account account = this.f16943c;
                if (account == null) {
                    if (googleSignInOptions.getAccount() == null) {
                        if (TextUtils.isEmpty(this.f16947g)) {
                            if (TextUtils.isEmpty(googleSignInOptions.J())) {
                                if (this.f16946f != googleSignInOptions.N() && this.f16944d == googleSignInOptions.Q() && this.f16945e == googleSignInOptions.S() && TextUtils.equals(this.f16950j, googleSignInOptions.j())) {
                                    return true;
                                }
                            }
                        } else if (!this.f16947g.equals(googleSignInOptions.J())) {
                            if (this.f16946f != googleSignInOptions.N()) {
                            }
                        }
                    }
                } else if (account.equals(googleSignInOptions.getAccount())) {
                    if (TextUtils.isEmpty(this.f16947g)) {
                        if (TextUtils.isEmpty(googleSignInOptions.J())) {
                            if (this.f16946f != googleSignInOptions.N()) {
                            }
                        }
                    } else if (!this.f16947g.equals(googleSignInOptions.J())) {
                        if (this.f16946f != googleSignInOptions.N()) {
                        }
                    }
                }
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    public Account getAccount() {
        return this.f16943c;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f16942b;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((Scope) arrayList2.get(i10)).getScopeUri());
        }
        Collections.sort(arrayList);
        p016b5.b bVar = new p016b5.b();
        bVar.a(arrayList);
        bVar.a(this.f16943c);
        bVar.a(this.f16947g);
        bVar.c(this.f16946f);
        bVar.c(this.f16944d);
        bVar.c(this.f16945e);
        bVar.a(this.f16950j);
        return bVar.b();
    }

    public String j() {
        return this.f16950j;
    }

    public ArrayList v() {
        return new ArrayList(this.f16942b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f16941a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i11);
        SafeParcelWriter.writeTypedList(parcel, 2, v(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getAccount(), i10, false);
        SafeParcelWriter.writeBoolean(parcel, 4, Q());
        SafeParcelWriter.writeBoolean(parcel, 5, S());
        SafeParcelWriter.writeBoolean(parcel, 6, N());
        SafeParcelWriter.writeString(parcel, 7, J(), false);
        SafeParcelWriter.writeString(parcel, 8, this.f16948h, false);
        SafeParcelWriter.writeTypedList(parcel, 9, a(), false);
        SafeParcelWriter.writeString(parcel, 10, j(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Set f16952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f16953b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f16954c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f16955d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f16956e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Account f16957f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f16958g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Map f16959h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f16960i;

        public a() {
            this.f16952a = new HashSet();
            this.f16959h = new HashMap();
        }

        private final String j(String str) {
            Preconditions.checkNotEmpty(str);
            String str2 = this.f16956e;
            boolean z9 = true;
            if (str2 != null && !str2.equals(str)) {
                z9 = false;
            }
            Preconditions.checkArgument(z9, "two different server client ids provided");
            return str;
        }

        public GoogleSignInOptions a() {
            if (this.f16952a.contains(GoogleSignInOptions.f16935I)) {
                Set set = this.f16952a;
                Scope scope = GoogleSignInOptions.f16934H;
                if (set.contains(scope)) {
                    this.f16952a.remove(scope);
                }
            }
            if (this.f16955d && (this.f16957f == null || !this.f16952a.isEmpty())) {
                b();
            }
            return new GoogleSignInOptions(new ArrayList(this.f16952a), this.f16957f, this.f16955d, this.f16953b, this.f16954c, this.f16956e, this.f16958g, this.f16959h, this.f16960i);
        }

        public a b() {
            this.f16952a.add(GoogleSignInOptions.f16933G);
            return this;
        }

        public a c(String str) {
            this.f16955d = true;
            j(str);
            this.f16956e = str;
            return this;
        }

        public a d() {
            this.f16952a.add(GoogleSignInOptions.f16939v);
            return this;
        }

        public a e(Scope scope, Scope... scopeArr) {
            this.f16952a.add(scope);
            this.f16952a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        public a f(String str, boolean z9) {
            this.f16953b = true;
            j(str);
            this.f16956e = str;
            this.f16954c = z9;
            return this;
        }

        public a g(String str) {
            this.f16957f = new Account(Preconditions.checkNotEmpty(str), AccountType.GOOGLE);
            return this;
        }

        public a h(String str) {
            this.f16958g = Preconditions.checkNotEmpty(str);
            return this;
        }

        public a i(String str) {
            this.f16960i = str;
            return this;
        }

        public a(GoogleSignInOptions googleSignInOptions) {
            this.f16952a = new HashSet();
            this.f16959h = new HashMap();
            Preconditions.checkNotNull(googleSignInOptions);
            this.f16952a = new HashSet(googleSignInOptions.f16942b);
            this.f16953b = googleSignInOptions.f16945e;
            this.f16954c = googleSignInOptions.f16946f;
            this.f16955d = googleSignInOptions.f16944d;
            this.f16956e = googleSignInOptions.f16947g;
            this.f16957f = googleSignInOptions.f16943c;
            this.f16958g = googleSignInOptions.f16948h;
            this.f16959h = GoogleSignInOptions.q1(googleSignInOptions.f16949i);
            this.f16960i = googleSignInOptions.f16950j;
        }
    }

    GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z9, boolean z10, boolean z11, String str, String str2, ArrayList arrayList2, String str3) {
        this(i10, arrayList, account, z9, z10, z11, str, str2, q1(arrayList2), str3);
    }

    private GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z9, boolean z10, boolean z11, String str, String str2, Map map, String str3) {
        this.f16941a = i10;
        this.f16942b = arrayList;
        this.f16943c = account;
        this.f16944d = z9;
        this.f16945e = z10;
        this.f16946f = z11;
        this.f16947g = str;
        this.f16948h = str2;
        this.f16949i = new ArrayList(map.values());
        this.f16951k = map;
        this.f16950j = str3;
    }
}

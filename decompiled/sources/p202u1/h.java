package p202u1;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.ComponentCallbacksC1144o;
import androidx.fragment.app.G;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p212v1.c;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G f49784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f49785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.RNAppleAuthentication.a f49786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function1 f49787d;

    public h(G fragmentManager, String fragmentTag, com.RNAppleAuthentication.a configuration, Function1 callback) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragmentTag, "fragmentTag");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f49784a = fragmentManager;
        this.f49785b = fragmentTag;
        this.f49786c = configuration;
        this.f49787d = callback;
        ComponentCallbacksC1144o componentCallbacksC1144oI0 = fragmentManager.i0(fragmentTag);
        c cVar = componentCallbacksC1144oI0 instanceof c ? (c) componentCallbacksC1144oI0 : null;
        if (cVar != null) {
            cVar.w(callback);
        }
    }

    public final void a() {
        c cVarA = c.f50107c.a(a.CREATOR.a(this.f49786c));
        cVarA.w(this.f49787d);
        cVarA.show(this.f49784a, this.f49785b);
    }

    public static final class a implements Parcelable {

        @NotNull
        public static final C0543a CREATOR = new C0543a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f49788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f49789b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f49790c;

        /* JADX INFO: renamed from: u1.h$a$a, reason: collision with other inner class name */
        public static final class C0543a implements Parcelable.Creator {
            public /* synthetic */ C0543a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(com.RNAppleAuthentication.a configuration) {
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                Uri.Builder builderBuildUpon = Uri.parse("https://appleid.apple.com/auth/authorize").buildUpon();
                builderBuildUpon.appendQueryParameter("client_id", configuration.a());
                builderBuildUpon.appendQueryParameter("redirect_uri", configuration.d());
                builderBuildUpon.appendQueryParameter("response_type", configuration.e());
                builderBuildUpon.appendQueryParameter("scope", configuration.f());
                builderBuildUpon.appendQueryParameter("response_mode", "form_post");
                builderBuildUpon.appendQueryParameter("state", configuration.g());
                if (!StringsKt.b0(configuration.b())) {
                    builderBuildUpon.appendQueryParameter("nonce", configuration.b());
                }
                String string = builderBuildUpon.build().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return new a(string, configuration.d(), configuration.g());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i10) {
                return new a[i10];
            }

            private C0543a() {
            }
        }

        public a(String authenticationUri, String redirectUri, String state) {
            Intrinsics.checkNotNullParameter(authenticationUri, "authenticationUri");
            Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
            Intrinsics.checkNotNullParameter(state, "state");
            this.f49788a = authenticationUri;
            this.f49789b = redirectUri;
            this.f49790c = state;
        }

        public final String a() {
            return this.f49788a;
        }

        public final String b() {
            return this.f49789b;
        }

        public final String c() {
            return this.f49790c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.b(this.f49788a, aVar.f49788a) && Intrinsics.b(this.f49789b, aVar.f49789b) && Intrinsics.b(this.f49790c, aVar.f49790c);
        }

        public int hashCode() {
            return (((this.f49788a.hashCode() * 31) + this.f49789b.hashCode()) * 31) + this.f49790c.hashCode();
        }

        public String toString() {
            return "AuthenticationAttempt(authenticationUri=" + this.f49788a + ", redirectUri=" + this.f49789b + ", state=" + this.f49790c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeString(this.f49788a);
            parcel.writeString(this.f49789b);
            parcel.writeString(this.f49790c);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            string = string == null ? "invalid" : string;
            String string2 = parcel.readString();
            string2 = string2 == null ? "invalid" : string2;
            String string3 = parcel.readString();
            this(string, string2, string3 != null ? string3 : "invalid");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(G fragmentManager, String fragmentTag, com.RNAppleAuthentication.a configuration, d callback) {
        this(fragmentManager, fragmentTag, configuration, f.b(callback));
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragmentTag, "fragmentTag");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }
}

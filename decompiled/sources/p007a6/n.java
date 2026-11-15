package p007a6;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f7307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f7308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f7309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f7310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f7311g;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f7312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f7313b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f7314c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f7315d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f7316e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f7317f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f7318g;

        public n a() {
            return new n(this.f7313b, this.f7312a, this.f7314c, this.f7315d, this.f7316e, this.f7317f, this.f7318g);
        }

        public b b(String str) {
            this.f7312a = Preconditions.checkNotEmpty(str, "ApiKey must be set.");
            return this;
        }

        public b c(String str) {
            this.f7313b = Preconditions.checkNotEmpty(str, "ApplicationId must be set.");
            return this;
        }

        public b d(String str) {
            this.f7314c = str;
            return this;
        }

        public b e(String str) {
            this.f7315d = str;
            return this;
        }

        public b f(String str) {
            this.f7316e = str;
            return this;
        }

        public b g(String str) {
            this.f7318g = str;
            return this;
        }

        public b h(String str) {
            this.f7317f = str;
            return this;
        }
    }

    public static n a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new n(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public String b() {
        return this.f7305a;
    }

    public String c() {
        return this.f7306b;
    }

    public String d() {
        return this.f7307c;
    }

    public String e() {
        return this.f7308d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Objects.equal(this.f7306b, nVar.f7306b) && Objects.equal(this.f7305a, nVar.f7305a) && Objects.equal(this.f7307c, nVar.f7307c) && Objects.equal(this.f7308d, nVar.f7308d) && Objects.equal(this.f7309e, nVar.f7309e) && Objects.equal(this.f7310f, nVar.f7310f) && Objects.equal(this.f7311g, nVar.f7311g);
    }

    public String f() {
        return this.f7309e;
    }

    public String g() {
        return this.f7311g;
    }

    public String h() {
        return this.f7310f;
    }

    public int hashCode() {
        return Objects.hashCode(this.f7306b, this.f7305a, this.f7307c, this.f7308d, this.f7309e, this.f7310f, this.f7311g);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f7306b).add("apiKey", this.f7305a).add("databaseUrl", this.f7307c).add("gcmSenderId", this.f7309e).add("storageBucket", this.f7310f).add("projectId", this.f7311g).toString();
    }

    private n(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f7306b = str;
        this.f7305a = str2;
        this.f7307c = str3;
        this.f7308d = str4;
        this.f7309e = str5;
        this.f7310f = str6;
        this.f7311g = str7;
    }
}

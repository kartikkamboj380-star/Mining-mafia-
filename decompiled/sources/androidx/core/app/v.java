package androidx.core.app;

import android.app.Person;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    CharSequence f9269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    IconCompat f9270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f9271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f9272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f9273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f9274f;

    static class a {
        static Person a(v vVar) {
            return new Person.Builder().setName(vVar.c()).setIcon(vVar.a() != null ? vVar.a().n() : null).setUri(vVar.d()).setKey(vVar.b()).setBot(vVar.e()).setImportant(vVar.f()).build();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        CharSequence f9275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        IconCompat f9276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f9277c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f9278d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f9279e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f9280f;

        public v a() {
            return new v(this);
        }

        public b b(boolean z9) {
            this.f9279e = z9;
            return this;
        }

        public b c(IconCompat iconCompat) {
            this.f9276b = iconCompat;
            return this;
        }

        public b d(boolean z9) {
            this.f9280f = z9;
            return this;
        }

        public b e(String str) {
            this.f9278d = str;
            return this;
        }

        public b f(CharSequence charSequence) {
            this.f9275a = charSequence;
            return this;
        }

        public b g(String str) {
            this.f9277c = str;
            return this;
        }
    }

    v(b bVar) {
        this.f9269a = bVar.f9275a;
        this.f9270b = bVar.f9276b;
        this.f9271c = bVar.f9277c;
        this.f9272d = bVar.f9278d;
        this.f9273e = bVar.f9279e;
        this.f9274f = bVar.f9280f;
    }

    public IconCompat a() {
        return this.f9270b;
    }

    public String b() {
        return this.f9272d;
    }

    public CharSequence c() {
        return this.f9269a;
    }

    public String d() {
        return this.f9271c;
    }

    public boolean e() {
        return this.f9273e;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        String strB = b();
        String strB2 = vVar.b();
        if (strB == null && strB2 == null) {
            return Objects.equals(Objects.toString(c()), Objects.toString(vVar.c())) && Objects.equals(d(), vVar.d()) && Boolean.valueOf(e()).equals(Boolean.valueOf(vVar.e())) && Boolean.valueOf(f()).equals(Boolean.valueOf(vVar.f()));
        }
        return Objects.equals(strB, strB2);
    }

    public boolean f() {
        return this.f9274f;
    }

    public String g() {
        String str = this.f9271c;
        if (str != null) {
            return str;
        }
        if (this.f9269a == null) {
            return "";
        }
        return "name:" + ((Object) this.f9269a);
    }

    public Person h() {
        return a.a(this);
    }

    public int hashCode() {
        String strB = b();
        return strB != null ? strB.hashCode() : Objects.hash(c(), d(), Boolean.valueOf(e()), Boolean.valueOf(f()));
    }

    public Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(MediationMetaData.KEY_NAME, this.f9269a);
        IconCompat iconCompat = this.f9270b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.m() : null);
        bundle.putString("uri", this.f9271c);
        bundle.putString("key", this.f9272d);
        bundle.putBoolean("isBot", this.f9273e);
        bundle.putBoolean("isImportant", this.f9274f);
        return bundle;
    }
}

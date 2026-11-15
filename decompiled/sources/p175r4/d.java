package p175r4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d f48254c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f48255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f48256b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f48257a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f48258b = new ArrayList();

        a() {
        }

        public d a() {
            return new d(this.f48257a, Collections.unmodifiableList(this.f48258b));
        }

        public a b(List list) {
            this.f48258b = list;
            return this;
        }

        public a c(String str) {
            this.f48257a = str;
            return this;
        }
    }

    d(String str, List list) {
        this.f48255a = str;
        this.f48256b = list;
    }

    public static a c() {
        return new a();
    }

    public List a() {
        return this.f48256b;
    }

    public String b() {
        return this.f48255a;
    }
}

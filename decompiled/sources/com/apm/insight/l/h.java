package com.apm.insight.l;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Writer f13063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<a> f13064b = new ArrayList();

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f13065a = new a("EMPTY_ARRAY", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f13066b = new a("NONEMPTY_ARRAY", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f13067c = new a("EMPTY_OBJECT", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f13068d = new a("DANGLING_KEY", 3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f13069e = new a("NONEMPTY_OBJECT", 4);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f13070f = new a("NULL", 5);

        private a(String str, int i10) {
            super(str, i10);
        }
    }

    private h(Writer writer) {
        this.f13063a = writer;
    }

    private h a() {
        return a(a.f13065a, "[");
    }

    private h b() {
        a aVar = a.f13065a;
        return a("]");
    }

    private h c() {
        return a(a.f13067c, "{");
    }

    private h d() {
        a aVar = a.f13065a;
        return a("}");
    }

    private a e() {
        List<a> list = this.f13064b;
        return list.get(list.size() - 1);
    }

    private void f() throws JSONException, IOException {
        if (this.f13064b.isEmpty()) {
            return;
        }
        a aVarE = e();
        if (aVarE == a.f13065a) {
            a(a.f13066b);
            return;
        }
        if (aVarE == a.f13066b) {
            this.f13063a.write(44);
        } else if (aVarE == a.f13068d) {
            this.f13063a.write(":");
            a(a.f13069e);
        } else if (aVarE != a.f13070f) {
            throw new JSONException("Nesting problem");
        }
    }

    public final String toString() {
        return "";
    }

    private h a(a aVar, String str) throws JSONException, IOException {
        f();
        this.f13064b.add(aVar);
        this.f13063a.write(str);
        return this;
    }

    private void b(String str) throws IOException {
        this.f13063a.write("\"");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\f') {
                this.f13063a.write("\\f");
            } else if (cCharAt != '\r') {
                if (cCharAt != '\"' && cCharAt != '/' && cCharAt != '\\') {
                    switch (cCharAt) {
                        case '\b':
                            this.f13063a.write("\\b");
                            continue;
                        case '\t':
                            this.f13063a.write("\\t");
                            continue;
                        case '\n':
                            this.f13063a.write("\\n");
                            continue;
                        default:
                            if (cCharAt <= 31) {
                                this.f13063a.write(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                            }
                            break;
                    }
                } else {
                    this.f13063a.write(92);
                }
                this.f13063a.write(cCharAt);
            } else {
                this.f13063a.write("\\r");
            }
        }
        this.f13063a.write("\"");
    }

    private h c(String str) throws JSONException, IOException {
        a aVarE = e();
        if (aVarE == a.f13069e) {
            this.f13063a.write(44);
        } else if (aVarE != a.f13067c) {
            throw new JSONException("Nesting problem");
        }
        a(a.f13068d);
        b(str);
        return this;
    }

    private h a(String str) throws IOException {
        e();
        List<a> list = this.f13064b;
        list.remove(list.size() - 1);
        this.f13063a.write(str);
        return this;
    }

    private void a(a aVar) {
        List<a> list = this.f13064b;
        list.set(list.size() - 1, aVar);
    }

    private h a(Object obj) throws JSONException, IOException {
        if (obj instanceof JSONArray) {
            a((JSONArray) obj);
            return this;
        }
        if (obj instanceof JSONObject) {
            a((JSONObject) obj);
            return this;
        }
        f();
        if (obj != null && obj != JSONObject.NULL) {
            if (obj instanceof Boolean) {
                this.f13063a.write(String.valueOf(obj));
                return this;
            }
            if (obj instanceof Number) {
                this.f13063a.write(JSONObject.numberToString((Number) obj));
                return this;
            }
            b(obj.toString());
            return this;
        }
        this.f13063a.write("null");
        return this;
    }

    public static void a(JSONObject jSONObject, Writer writer) throws JSONException, IOException {
        new h(writer).a(jSONObject);
        writer.flush();
    }

    public static void a(JSONArray jSONArray, Writer writer) throws IOException {
        new h(writer).a(jSONArray);
        writer.flush();
    }

    private void a(JSONObject jSONObject) throws JSONException {
        c();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            c(next).a(jSONObject.get(next));
        }
        d();
    }

    private void a(JSONArray jSONArray) {
        a();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            a(jSONArray.get(i10));
        }
        b();
    }
}

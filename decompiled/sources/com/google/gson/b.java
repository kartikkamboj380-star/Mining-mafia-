package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements com.google.gson.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f40732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f40733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f40734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f40735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f40736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f40737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f40738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ b[] f40739h;

    final enum a extends b {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // com.google.gson.c
        public String d(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        f40732a = aVar;
        b bVar = new b("UPPER_CAMEL_CASE", 1) { // from class: com.google.gson.b.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c
            public String d(Field field) {
                return b.f(field.getName());
            }
        };
        f40733b = bVar;
        b bVar2 = new b("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: com.google.gson.b.c
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c
            public String d(Field field) {
                return b.f(b.e(field.getName(), ' '));
            }
        };
        f40734c = bVar2;
        b bVar3 = new b("UPPER_CASE_WITH_UNDERSCORES", 3) { // from class: com.google.gson.b.d
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c
            public String d(Field field) {
                return b.e(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        f40735d = bVar3;
        b bVar4 = new b("LOWER_CASE_WITH_UNDERSCORES", 4) { // from class: com.google.gson.b.e
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c
            public String d(Field field) {
                return b.e(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        f40736e = bVar4;
        b bVar5 = new b("LOWER_CASE_WITH_DASHES", 5) { // from class: com.google.gson.b.f
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c
            public String d(Field field) {
                return b.e(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        f40737f = bVar5;
        b bVar6 = new b("LOWER_CASE_WITH_DOTS", 6) { // from class: com.google.gson.b.g
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c
            public String d(Field field) {
                return b.e(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        };
        f40738g = bVar6;
        f40739h = new b[]{aVar, bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
    }

    private b(String str, int i10) {
        super(str, i10);
    }

    static String e(String str, char c10) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c10);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    static String f(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    break;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i10 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i10) + upperCase + str.substring(i10 + 1);
            }
        }
        return str;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f40739h.clone();
    }

    /* synthetic */ b(String str, int i10, a aVar) {
        this(str, i10);
    }
}

package com.google.gson.internal.sql;

import com.google.gson.t;
import java.sql.Date;
import java.sql.Timestamp;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f40921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.google.gson.internal.bind.c.b f40922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.google.gson.internal.bind.c.b f40923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f40924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t f40925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t f40926f;

    class a extends com.google.gson.internal.bind.c.b {
        a(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.c.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Date a(java.util.Date date) {
            return new Date(date.getTime());
        }
    }

    class b extends com.google.gson.internal.bind.c.b {
        b(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.c.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Timestamp a(java.util.Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z9;
        try {
            Class.forName("java.sql.Date");
            z9 = true;
        } catch (ClassNotFoundException unused) {
            z9 = false;
        }
        f40921a = z9;
        if (z9) {
            f40922b = new a(Date.class);
            f40923c = new b(Timestamp.class);
            f40924d = com.google.gson.internal.sql.a.f40915b;
            f40925e = com.google.gson.internal.sql.b.f40917b;
            f40926f = c.f40919b;
            return;
        }
        f40922b = null;
        f40923c = null;
        f40924d = null;
        f40925e = null;
        f40926f = null;
    }
}

package com.google.gson.internal.sql;

import com.google.gson.e;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.t;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
class c extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final t f40919b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f40920a;

    class a implements t {
        a() {
        }

        @Override // com.google.gson.t
        public s b(e eVar, TypeToken typeToken) {
            a aVar = null;
            if (typeToken.getRawType() == Timestamp.class) {
                return new c(eVar.m(Date.class), aVar);
            }
            return null;
        }
    }

    /* synthetic */ c(s sVar, a aVar) {
        this(sVar);
    }

    @Override // com.google.gson.s
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Timestamp b(p138n7.a aVar) {
        Date date = (Date) this.f40920a.b(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.s
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(p138n7.c cVar, Timestamp timestamp) {
        this.f40920a.d(cVar, timestamp);
    }

    private c(s sVar) {
        this.f40920a = sVar;
    }
}

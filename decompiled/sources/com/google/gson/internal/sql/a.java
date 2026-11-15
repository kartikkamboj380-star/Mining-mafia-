package com.google.gson.internal.sql;

import com.google.gson.e;
import com.google.gson.m;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.t;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
final class a extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final t f40915b = new C0380a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DateFormat f40916a;

    /* JADX INFO: renamed from: com.google.gson.internal.sql.a$a, reason: collision with other inner class name */
    class C0380a implements t {
        C0380a() {
        }

        @Override // com.google.gson.t
        public s b(e eVar, TypeToken typeToken) {
            C0380a c0380a = null;
            if (typeToken.getRawType() == Date.class) {
                return new a(c0380a);
            }
            return null;
        }
    }

    /* synthetic */ a(C0380a c0380a) {
        this();
    }

    @Override // com.google.gson.s
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Date b(p138n7.a aVar) throws IOException {
        Date date;
        if (aVar.n1() == p138n7.b.NULL) {
            aVar.V0();
            return null;
        }
        String strL1 = aVar.l1();
        synchronized (this) {
            TimeZone timeZone = this.f40916a.getTimeZone();
            try {
                try {
                    date = new Date(this.f40916a.parse(strL1).getTime());
                    this.f40916a.setTimeZone(timeZone);
                } catch (ParseException e10) {
                    throw new m("Failed parsing '" + strL1 + "' as SQL Date; at path " + aVar.M(), e10);
                }
            } catch (Throwable th) {
                this.f40916a.setTimeZone(timeZone);
                throw th;
            }
        }
        return date;
    }

    @Override // com.google.gson.s
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(p138n7.c cVar, Date date) throws IOException {
        String str;
        if (date == null) {
            cVar.S();
            return;
        }
        synchronized (this) {
            str = this.f40916a.format((java.util.Date) date);
        }
        cVar.p1(str);
    }

    private a() {
        this.f40916a = new SimpleDateFormat("MMM d, yyyy");
    }
}

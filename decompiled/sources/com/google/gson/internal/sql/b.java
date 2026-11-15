package com.google.gson.internal.sql;

import com.google.gson.e;
import com.google.gson.m;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.t;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
final class b extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final t f40917b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DateFormat f40918a;

    class a implements t {
        a() {
        }

        @Override // com.google.gson.t
        public s b(e eVar, TypeToken typeToken) {
            a aVar = null;
            if (typeToken.getRawType() == Time.class) {
                return new b(aVar);
            }
            return null;
        }
    }

    /* synthetic */ b(a aVar) {
        this();
    }

    @Override // com.google.gson.s
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Time b(p138n7.a aVar) throws IOException {
        Time time;
        if (aVar.n1() == p138n7.b.NULL) {
            aVar.V0();
            return null;
        }
        String strL1 = aVar.l1();
        synchronized (this) {
            TimeZone timeZone = this.f40918a.getTimeZone();
            try {
                try {
                    time = new Time(this.f40918a.parse(strL1).getTime());
                    this.f40918a.setTimeZone(timeZone);
                } catch (ParseException e10) {
                    throw new m("Failed parsing '" + strL1 + "' as SQL Time; at path " + aVar.M(), e10);
                }
            } catch (Throwable th) {
                this.f40918a.setTimeZone(timeZone);
                throw th;
            }
        }
        return time;
    }

    @Override // com.google.gson.s
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(p138n7.c cVar, Time time) throws IOException {
        String str;
        if (time == null) {
            cVar.S();
            return;
        }
        synchronized (this) {
            str = this.f40918a.format((Date) time);
        }
        cVar.p1(str);
    }

    private b() {
        this.f40918a = new SimpleDateFormat("hh:mm:ss a");
    }
}

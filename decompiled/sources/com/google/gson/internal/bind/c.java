package com.google.gson.internal.bind;

import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.t;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import p108k7.D;
import p108k7.x;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f40789c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f40790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f40791b;

    class a implements t {
        a() {
        }

        @Override // com.google.gson.t
        public s b(com.google.gson.e eVar, TypeToken typeToken) {
            a aVar = null;
            if (typeToken.getRawType() != Date.class) {
                return null;
            }
            int i10 = 2;
            return new c(b.f40792b, i10, i10, aVar);
        }

        public String toString() {
            return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
        }
    }

    public static abstract class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f40792b = new a(Date.class);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f40793a;

        class a extends b {
            a(Class cls) {
                super(cls);
            }

            @Override // com.google.gson.internal.bind.c.b
            protected Date a(Date date) {
                return date;
            }
        }

        protected b(Class cls) {
            this.f40793a = cls;
        }

        protected abstract Date a(Date date);
    }

    /* synthetic */ c(b bVar, int i10, int i11, a aVar) {
        this(bVar, i10, i11);
    }

    private Date e(p138n7.a aVar) throws IOException {
        String strL1 = aVar.l1();
        synchronized (this.f40791b) {
            try {
                for (DateFormat dateFormat : this.f40791b) {
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            Date date = dateFormat.parse(strL1);
                            dateFormat.setTimeZone(timeZone);
                            return date;
                        } catch (Throwable th) {
                            dateFormat.setTimeZone(timeZone);
                            throw th;
                        }
                    } catch (ParseException unused) {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
                try {
                    return p118l7.a.c(strL1, new ParsePosition(0));
                } catch (ParseException e10) {
                    throw new com.google.gson.m("Failed parsing '" + strL1 + "' as Date; at path " + aVar.M(), e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.gson.s
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Date b(p138n7.a aVar) throws IOException {
        if (aVar.n1() == p138n7.b.NULL) {
            aVar.V0();
            return null;
        }
        return this.f40790a.a(e(aVar));
    }

    @Override // com.google.gson.s
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(p138n7.c cVar, Date date) throws IOException {
        String str;
        if (date == null) {
            cVar.S();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f40791b.get(0);
        synchronized (this.f40791b) {
            str = dateFormat.format(date);
        }
        cVar.p1(str);
    }

    public String toString() {
        DateFormat dateFormat = (DateFormat) this.f40791b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    private c(b bVar, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f40791b = arrayList;
        Objects.requireNonNull(bVar);
        this.f40790a = bVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (x.c()) {
            arrayList.add(D.c(i10, i11));
        }
    }
}

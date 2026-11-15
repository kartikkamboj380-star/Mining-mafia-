package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final s f39178c = new s(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Long f39179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimeZone f39180b;

    private s(Long l10, TimeZone timeZone) {
        this.f39179a = l10;
        this.f39180b = timeZone;
    }

    static s c() {
        return f39178c;
    }

    Calendar a() {
        return b(this.f39180b);
    }

    Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l10 = this.f39179a;
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        return calendar;
    }
}

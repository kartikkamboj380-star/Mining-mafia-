package H8;

import java.util.concurrent.TimeUnit;
import kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes3.dex */
public enum b {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);


    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f1567j = p189s8.a.a(c());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimeUnit f1568a;

    b(TimeUnit timeUnit) {
        this.f1568a = timeUnit;
    }

    public final TimeUnit d() {
        return this.f1568a;
    }
}

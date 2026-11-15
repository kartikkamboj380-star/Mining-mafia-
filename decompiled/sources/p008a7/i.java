package p008a7;

import p007a6.l;

/* JADX INFO: loaded from: classes3.dex */
public class i extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f7325a;

    public enum a {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f7332a;

        a(int i10) {
            this.f7332a = i10;
        }
    }

    public i(String str) {
        super(str);
        this.f7325a = a.UNKNOWN;
    }

    public i(String str, Throwable th) {
        super(str, th);
        this.f7325a = a.UNKNOWN;
    }

    public i(String str, a aVar) {
        super(str);
        this.f7325a = aVar;
    }

    public i(String str, Throwable th, a aVar) {
        super(str, th);
        this.f7325a = aVar;
    }
}

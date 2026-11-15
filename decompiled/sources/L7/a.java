package L7;

import kotlin.Pair;
import kotlin.collections.E;
import kotlin.jvm.internal.Intrinsics;
import p129m8.q;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final Pair a(K7.c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return q.a(event.getEventName(), E.i(q.a("registrationName", event.a())));
    }
}

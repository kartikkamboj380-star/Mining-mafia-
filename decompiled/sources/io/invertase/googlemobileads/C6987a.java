package io.invertase.googlemobileads;

import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.invertase.googlemobileads.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6987a extends com.facebook.react.uimanager.events.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0445a f45284b = new C0445a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WritableMap f45285a;

    /* JADX INFO: renamed from: io.invertase.googlemobileads.a$a, reason: collision with other inner class name */
    public static final class C0445a {
        public /* synthetic */ C0445a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0445a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6987a(int i10, WritableMap event) {
        super(i10);
        Intrinsics.checkNotNullParameter(event, "event");
        this.f45285a = event;
    }

    @Override // com.facebook.react.uimanager.events.e
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.e
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.e
    protected WritableMap getEventData() {
        return this.f45285a;
    }

    @Override // com.facebook.react.uimanager.events.e
    public String getEventName() {
        return "topNativeEvent";
    }
}

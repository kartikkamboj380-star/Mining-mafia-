package M7;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends com.facebook.react.uimanager.events.e implements K7.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0057a f3532a = new C0057a(null);

    /* JADX INFO: renamed from: M7.a$a, reason: collision with other inner class name */
    public static final class C0057a implements K7.c {
        public /* synthetic */ C0057a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // K7.c
        public String a() {
            return "onDidAppear";
        }

        @Override // K7.c
        public String getEventName() {
            return "topDidAppear";
        }

        private C0057a() {
        }
    }

    public a(int i10, int i11) {
        super(i10, i11);
    }

    @Override // K7.c
    public String a() {
        return "onDidAppear";
    }

    @Override // com.facebook.react.uimanager.events.e
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.e
    protected WritableMap getEventData() {
        return Arguments.createMap();
    }

    @Override // com.facebook.react.uimanager.events.e
    public String getEventName() {
        return "topDidAppear";
    }
}

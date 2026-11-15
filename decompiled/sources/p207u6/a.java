package p207u6;

/* JADX INFO: loaded from: classes3.dex */
public class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f49986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d[] f49987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f49988c;

    public a(int i10, d... dVarArr) {
        this.f49986a = i10;
        this.f49987b = dVarArr;
        this.f49988c = new b(i10);
    }

    @Override // p207u6.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f49986a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrA = stackTraceElementArr;
        for (d dVar : this.f49987b) {
            if (stackTraceElementArrA.length <= this.f49986a) {
                break;
            }
            stackTraceElementArrA = dVar.a(stackTraceElementArr);
        }
        return stackTraceElementArrA.length > this.f49986a ? this.f49988c.a(stackTraceElementArrA) : stackTraceElementArrA;
    }
}

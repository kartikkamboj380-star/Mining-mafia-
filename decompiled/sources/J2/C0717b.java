package J2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: J2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0717b implements InterfaceC0731p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f2020f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f2021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f2022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f2023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f2024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ScheduledExecutorService f2025e;

    /* JADX INFO: renamed from: J2.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C0717b(int i10) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2, new B(10, "FrescoIoBoundExecutor", true));
        Intrinsics.checkNotNullExpressionValue(executorServiceNewFixedThreadPool, "newFixedThreadPool(...)");
        this.f2021a = executorServiceNewFixedThreadPool;
        ExecutorService executorServiceNewFixedThreadPool2 = Executors.newFixedThreadPool(i10, new B(10, "FrescoDecodeExecutor", true));
        Intrinsics.checkNotNullExpressionValue(executorServiceNewFixedThreadPool2, "newFixedThreadPool(...)");
        this.f2022b = executorServiceNewFixedThreadPool2;
        ExecutorService executorServiceNewFixedThreadPool3 = Executors.newFixedThreadPool(i10, new B(10, "FrescoBackgroundExecutor", true));
        Intrinsics.checkNotNullExpressionValue(executorServiceNewFixedThreadPool3, "newFixedThreadPool(...)");
        this.f2023c = executorServiceNewFixedThreadPool3;
        ExecutorService executorServiceNewFixedThreadPool4 = Executors.newFixedThreadPool(1, new B(10, "FrescoLightWeightBackgroundExecutor", true));
        Intrinsics.checkNotNullExpressionValue(executorServiceNewFixedThreadPool4, "newFixedThreadPool(...)");
        this.f2024d = executorServiceNewFixedThreadPool4;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(i10, new B(10, "FrescoBackgroundExecutor", true));
        Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewScheduledThreadPool, "newScheduledThreadPool(...)");
        this.f2025e = scheduledExecutorServiceNewScheduledThreadPool;
    }

    @Override // J2.InterfaceC0731p
    public Executor a() {
        return this.f2024d;
    }

    @Override // J2.InterfaceC0731p
    public Executor b() {
        return this.f2021a;
    }

    @Override // J2.InterfaceC0731p
    public ScheduledExecutorService c() {
        return this.f2025e;
    }

    @Override // J2.InterfaceC0731p
    public Executor d() {
        return this.f2022b;
    }

    @Override // J2.InterfaceC0731p
    public Executor e() {
        return this.f2023c;
    }

    @Override // J2.InterfaceC0731p
    public Executor f() {
        return this.f2021a;
    }

    @Override // J2.InterfaceC0731p
    public Executor g() {
        return this.f2021a;
    }
}

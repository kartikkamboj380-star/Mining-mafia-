package com.unity3d.ads.core.domain;

import android.app.Activity;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    */
/* JADX INFO: loaded from: classes3.dex */
@Metadata
public interface LifecycleEvent {

    @Metadata
    public static final class Created implements LifecycleEvent {

        @NotNull
        private final WeakReference<Activity> activity;

        @Nullable
        private final Bundle bundle;

        public Created(@NotNull WeakReference<Activity> activity, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
            this.bundle = bundle;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Created copy$default(Created created, WeakReference weakReference, Bundle bundle, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = created.getActivity();
            }
            if ((i10 & 2) != 0) {
                bundle = created.bundle;
            }
            return created.copy(weakReference, bundle);
        }

        @NotNull
        public final WeakReference<Activity> component1() {
            return getActivity();
        }

        @Nullable
        public final Bundle component2() {
            return this.bundle;
        }

        @NotNull
        public final Created copy(@NotNull WeakReference<Activity> activity, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return new Created(activity, bundle);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Created)) {
                return false;
            }
            Created created = (Created) obj;
            return Intrinsics.b(getActivity(), created.getActivity()) && Intrinsics.b(this.bundle, created.bundle);
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        @NotNull
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        @Nullable
        public final Bundle getBundle() {
            return this.bundle;
        }

        public int hashCode() {
            int iHashCode = getActivity().hashCode() * 31;
            Bundle bundle = this.bundle;
            return iHashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        @NotNull
        public String toString() {
            return "Created(activity=" + getActivity() + ", bundle=" + this.bundle + ')';
        }
    }

    @Metadata
    public static final class Destroyed implements LifecycleEvent {

        @NotNull
        private final WeakReference<Activity> activity;

        public Destroyed(@NotNull WeakReference<Activity> activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Destroyed copy$default(Destroyed destroyed, WeakReference weakReference, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = destroyed.getActivity();
            }
            return destroyed.copy(weakReference);
        }

        @NotNull
        public final WeakReference<Activity> component1() {
            return getActivity();
        }

        @NotNull
        public final Destroyed copy(@NotNull WeakReference<Activity> activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return new Destroyed(activity);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Destroyed) && Intrinsics.b(getActivity(), ((Destroyed) obj).getActivity());
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        @NotNull
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        @NotNull
        public String toString() {
            return "Destroyed(activity=" + getActivity() + ')';
        }
    }

    @Metadata
    public static final class Paused implements LifecycleEvent {

        @NotNull
        private final WeakReference<Activity> activity;

        public Paused(@NotNull WeakReference<Activity> activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Paused copy$default(Paused paused, WeakReference weakReference, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = paused.getActivity();
            }
            return paused.copy(weakReference);
        }

        @NotNull
        public final WeakReference<Activity> component1() {
            return getActivity();
        }

        @NotNull
        public final Paused copy(@NotNull WeakReference<Activity> activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return new Paused(activity);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Paused) && Intrinsics.b(getActivity(), ((Paused) obj).getActivity());
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        @NotNull
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        @NotNull
        public String toString() {
            return "Paused(activity=" + getActivity() + ')';
        }
    }

    @Metadata
    public static final class Resumed implements LifecycleEvent {

        @NotNull
        private final WeakReference<Activity> activity;

        public Resumed(@NotNull WeakReference<Activity> activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Resumed copy$default(Resumed resumed, WeakReference weakReference, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = resumed.getActivity();
            }
            return resumed.copy(weakReference);
        }

        @NotNull
        public final WeakReference<Activity> component1() {
            return getActivity();
        }

        @NotNull
        public final Resumed copy(@NotNull WeakReference<Activity> activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return new Resumed(activity);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Resumed) && Intrinsics.b(getActivity(), ((Resumed) obj).getActivity());
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        @NotNull
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        @NotNull
        public String toString() {
            return "Resumed(activity=" + getActivity() + ')';
        }
    }

    @Metadata
    public static final class SaveInstanceState implements LifecycleEvent {

        @NotNull
        private final WeakReference<Activity> activity;

        @Nullable
        private final Bundle bundle;

        public SaveInstanceState(@NotNull WeakReference<Activity> activity, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
            this.bundle = bundle;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SaveInstanceState copy$default(SaveInstanceState saveInstanceState, WeakReference weakReference, Bundle bundle, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = saveInstanceState.getActivity();
            }
            if ((i10 & 2) != 0) {
                bundle = saveInstanceState.bundle;
            }
            return saveInstanceState.copy(weakReference, bundle);
        }

        @NotNull
        public final WeakReference<Activity> component1() {
            return getActivity();
        }

        @Nullable
        public final Bundle component2() {
            return this.bundle;
        }

        @NotNull
        public final SaveInstanceState copy(@NotNull WeakReference<Activity> activity, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return new SaveInstanceState(activity, bundle);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SaveInstanceState)) {
                return false;
            }
            SaveInstanceState saveInstanceState = (SaveInstanceState) obj;
            return Intrinsics.b(getActivity(), saveInstanceState.getActivity()) && Intrinsics.b(this.bundle, saveInstanceState.bundle);
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        @NotNull
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        @Nullable
        public final Bundle getBundle() {
            return this.bundle;
        }

        public int hashCode() {
            int iHashCode = getActivity().hashCode() * 31;
            Bundle bundle = this.bundle;
            return iHashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        @NotNull
        public String toString() {
            return "SaveInstanceState(activity=" + getActivity() + ", bundle=" + this.bundle + ')';
        }
    }

    @Metadata
    public static final class Started implements LifecycleEvent {

        @NotNull
        private final WeakReference<Activity> activity;

        public Started(@NotNull WeakReference<Activity> activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Started copy$default(Started started, WeakReference weakReference, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = started.getActivity();
            }
            return started.copy(weakReference);
        }

        @NotNull
        public final WeakReference<Activity> component1() {
            return getActivity();
        }

        @NotNull
        public final Started copy(@NotNull WeakReference<Activity> activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return new Started(activity);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Started) && Intrinsics.b(getActivity(), ((Started) obj).getActivity());
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        @NotNull
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        @NotNull
        public String toString() {
            return "Started(activity=" + getActivity() + ')';
        }
    }

    @Metadata
    public static final class Stopped implements LifecycleEvent {

        @NotNull
        private final WeakReference<Activity> activity;

        public Stopped(@NotNull WeakReference<Activity> activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Stopped copy$default(Stopped stopped, WeakReference weakReference, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = stopped.getActivity();
            }
            return stopped.copy(weakReference);
        }

        @NotNull
        public final WeakReference<Activity> component1() {
            return getActivity();
        }

        @NotNull
        public final Stopped copy(@NotNull WeakReference<Activity> activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return new Stopped(activity);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Stopped) && Intrinsics.b(getActivity(), ((Stopped) obj).getActivity());
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        @NotNull
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        @NotNull
        public String toString() {
            return "Stopped(activity=" + getActivity() + ')';
        }
    }

    @NotNull
    WeakReference<Activity> getActivity();
}

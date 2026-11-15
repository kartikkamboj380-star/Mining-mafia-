package com.miningmafia.app.ui.transactions;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.miningmafia.app.R;
import com.miningmafia.app.databinding.FragmentTransactionsBinding;
import com.miningmafia.app.data.remote.model.Transaction;
import com.miningmafia.app.ui.viewmodel.TransactionsViewModel;
import java.util.ArrayList;
import java.util.List;

/**
 * Transactions screen: history of rewards, deposits, withdrawals.
 */
public class TransactionsFragment extends Fragment {

    private FragmentTransactionsBinding binding;
    private TransactionsViewModel viewModel;
    private TxAdapter adapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentTransactionsBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel = new ViewModelProvider(this).get(TransactionsViewModel.class);

        adapter = new TxAdapter(new ArrayList<>());
        binding.recyclerTransactions.setLayoutManager(new LinearLayoutManager(requireContext()));
        binding.recyclerTransactions.setAdapter(adapter);

        viewModel.transactions.observe(getViewLifecycleOwner(), txs -> {
            adapter.submitList(txs != null ? txs : new ArrayList<>());
            binding.txtEmpty.setVisibility((txs == null || txs.isEmpty()) ? View.VISIBLE : View.GONE);
        });

        viewModel.uiState.observe(getViewLifecycleOwner(), state -> {
            if (state.error != null) Toast.makeText(requireContext(), state.error, Toast.LENGTH_LONG).show();
        });

        viewModel.load(50, 0);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private static class TxAdapter extends RecyclerView.Adapter<TxAdapter.ViewHolder> {
        private List<Transaction> items = new ArrayList<>();
        TxAdapter(List<Transaction> items) { this.items = items; }
        void submitList(List<Transaction> list) { this.items = list != null ? list : new ArrayList<>(); notifyDataSetChanged(); }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_2, parent, false);
            return new ViewHolder(v);
        }
        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            Transaction t = items.get(position);
            holder.txt1.setText((t.type != null ? t.type : "Transaction") + " · " + (t.status != null ? t.status : ""));
            holder.txt2.setText(String.format("%s %s · %s", t.amount, t.currency, t.timestamp));
        }
        @Override
        public int getItemCount() { return items.size(); }
        static class ViewHolder extends RecyclerView.ViewHolder {
            TextView txt1, txt2;
            ViewHolder(View v) { super(v); txt1 = v.findViewById(android.R.id.text1); txt2 = v.findViewById(android.R.id.text2); }
        }
    }
}

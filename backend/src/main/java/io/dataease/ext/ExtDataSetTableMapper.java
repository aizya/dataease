package io.dataease.ext;

import io.dataease.controller.request.dataset.DataSetTableRequest;
import io.dataease.dto.dataset.DataSetTableDTO;
import io.dataease.plugins.common.base.domain.DatasetTable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExtDataSetTableMapper {
    List<DataSetTableDTO> search(DataSetTableRequest request);

    DataSetTableDTO searchOne(DataSetTableRequest request);

    List<DataSetTableDTO> searchDataSetTableWithPanelId(@Param("panelId") String panelId, @Param("userId") String userId);
    List<DatasetTable> findByPanelId(@Param("panelId") String panelId);

}

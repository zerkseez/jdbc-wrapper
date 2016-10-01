/*******************************************************************************
 * Copyright 2016 Xerxes Tsang
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.github.zerkseez.jdbc.wrapper;

import javax.annotation.Generated;

@Generated("com.github.zerkseez.codegen.wrappergenerator.WrapperGenerator")
public class WrappedDatabaseMetaData implements java.sql.DatabaseMetaData {
    private final java.sql.DatabaseMetaData wrappedObject;

    public WrappedDatabaseMetaData(final java.sql.DatabaseMetaData wrappedObject) {
        this.wrappedObject = wrappedObject;
    }

    @Override
    public boolean allProceduresAreCallable() throws java.sql.SQLException {
        return wrappedObject.allProceduresAreCallable();
    }

    @Override
    public boolean allTablesAreSelectable() throws java.sql.SQLException {
        return wrappedObject.allTablesAreSelectable();
    }

    @Override
    public boolean autoCommitFailureClosesAllResultSets() throws java.sql.SQLException {
        return wrappedObject.autoCommitFailureClosesAllResultSets();
    }

    @Override
    public boolean dataDefinitionCausesTransactionCommit() throws java.sql.SQLException {
        return wrappedObject.dataDefinitionCausesTransactionCommit();
    }

    @Override
    public boolean dataDefinitionIgnoredInTransactions() throws java.sql.SQLException {
        return wrappedObject.dataDefinitionIgnoredInTransactions();
    }

    @Override
    public boolean deletesAreDetected(final int p0) throws java.sql.SQLException {
        return wrappedObject.deletesAreDetected(p0);
    }

    @Override
    public boolean doesMaxRowSizeIncludeBlobs() throws java.sql.SQLException {
        return wrappedObject.doesMaxRowSizeIncludeBlobs();
    }

    @Override
    public boolean generatedKeyAlwaysReturned() throws java.sql.SQLException {
        return wrappedObject.generatedKeyAlwaysReturned();
    }

    @Override
    public java.sql.ResultSet getAttributes(final String p0, final String p1, final String p2, final String p3) throws java.sql.SQLException {
        return wrappedObject.getAttributes(p0, p1, p2, p3);
    }

    @Override
    public java.sql.ResultSet getBestRowIdentifier(final String p0, final String p1, final String p2, final int p3, final boolean p4) throws java.sql.SQLException {
        return wrappedObject.getBestRowIdentifier(p0, p1, p2, p3, p4);
    }

    @Override
    public String getCatalogSeparator() throws java.sql.SQLException {
        return wrappedObject.getCatalogSeparator();
    }

    @Override
    public String getCatalogTerm() throws java.sql.SQLException {
        return wrappedObject.getCatalogTerm();
    }

    @Override
    public java.sql.ResultSet getCatalogs() throws java.sql.SQLException {
        return wrappedObject.getCatalogs();
    }

    @Override
    public java.sql.ResultSet getClientInfoProperties() throws java.sql.SQLException {
        return wrappedObject.getClientInfoProperties();
    }

    @Override
    public java.sql.ResultSet getColumnPrivileges(final String p0, final String p1, final String p2, final String p3) throws java.sql.SQLException {
        return wrappedObject.getColumnPrivileges(p0, p1, p2, p3);
    }

    @Override
    public java.sql.ResultSet getColumns(final String p0, final String p1, final String p2, final String p3) throws java.sql.SQLException {
        return wrappedObject.getColumns(p0, p1, p2, p3);
    }

    @Override
    public java.sql.Connection getConnection() throws java.sql.SQLException {
        return wrappedObject.getConnection();
    }

    @Override
    public java.sql.ResultSet getCrossReference(final String p0, final String p1, final String p2, final String p3, final String p4, final String p5) throws java.sql.SQLException {
        return wrappedObject.getCrossReference(p0, p1, p2, p3, p4, p5);
    }

    @Override
    public int getDatabaseMajorVersion() throws java.sql.SQLException {
        return wrappedObject.getDatabaseMajorVersion();
    }

    @Override
    public int getDatabaseMinorVersion() throws java.sql.SQLException {
        return wrappedObject.getDatabaseMinorVersion();
    }

    @Override
    public String getDatabaseProductName() throws java.sql.SQLException {
        return wrappedObject.getDatabaseProductName();
    }

    @Override
    public String getDatabaseProductVersion() throws java.sql.SQLException {
        return wrappedObject.getDatabaseProductVersion();
    }

    @Override
    public int getDefaultTransactionIsolation() throws java.sql.SQLException {
        return wrappedObject.getDefaultTransactionIsolation();
    }

    @Override
    public int getDriverMajorVersion() {
        return wrappedObject.getDriverMajorVersion();
    }

    @Override
    public int getDriverMinorVersion() {
        return wrappedObject.getDriverMinorVersion();
    }

    @Override
    public String getDriverName() throws java.sql.SQLException {
        return wrappedObject.getDriverName();
    }

    @Override
    public String getDriverVersion() throws java.sql.SQLException {
        return wrappedObject.getDriverVersion();
    }

    @Override
    public java.sql.ResultSet getExportedKeys(final String p0, final String p1, final String p2) throws java.sql.SQLException {
        return wrappedObject.getExportedKeys(p0, p1, p2);
    }

    @Override
    public String getExtraNameCharacters() throws java.sql.SQLException {
        return wrappedObject.getExtraNameCharacters();
    }

    @Override
    public java.sql.ResultSet getFunctionColumns(final String p0, final String p1, final String p2, final String p3) throws java.sql.SQLException {
        return wrappedObject.getFunctionColumns(p0, p1, p2, p3);
    }

    @Override
    public java.sql.ResultSet getFunctions(final String p0, final String p1, final String p2) throws java.sql.SQLException {
        return wrappedObject.getFunctions(p0, p1, p2);
    }

    @Override
    public String getIdentifierQuoteString() throws java.sql.SQLException {
        return wrappedObject.getIdentifierQuoteString();
    }

    @Override
    public java.sql.ResultSet getImportedKeys(final String p0, final String p1, final String p2) throws java.sql.SQLException {
        return wrappedObject.getImportedKeys(p0, p1, p2);
    }

    @Override
    public java.sql.ResultSet getIndexInfo(final String p0, final String p1, final String p2, final boolean p3, final boolean p4) throws java.sql.SQLException {
        return wrappedObject.getIndexInfo(p0, p1, p2, p3, p4);
    }

    @Override
    public int getJDBCMajorVersion() throws java.sql.SQLException {
        return wrappedObject.getJDBCMajorVersion();
    }

    @Override
    public int getJDBCMinorVersion() throws java.sql.SQLException {
        return wrappedObject.getJDBCMinorVersion();
    }

    @Override
    public int getMaxBinaryLiteralLength() throws java.sql.SQLException {
        return wrappedObject.getMaxBinaryLiteralLength();
    }

    @Override
    public int getMaxCatalogNameLength() throws java.sql.SQLException {
        return wrappedObject.getMaxCatalogNameLength();
    }

    @Override
    public int getMaxCharLiteralLength() throws java.sql.SQLException {
        return wrappedObject.getMaxCharLiteralLength();
    }

    @Override
    public int getMaxColumnNameLength() throws java.sql.SQLException {
        return wrappedObject.getMaxColumnNameLength();
    }

    @Override
    public int getMaxColumnsInGroupBy() throws java.sql.SQLException {
        return wrappedObject.getMaxColumnsInGroupBy();
    }

    @Override
    public int getMaxColumnsInIndex() throws java.sql.SQLException {
        return wrappedObject.getMaxColumnsInIndex();
    }

    @Override
    public int getMaxColumnsInOrderBy() throws java.sql.SQLException {
        return wrappedObject.getMaxColumnsInOrderBy();
    }

    @Override
    public int getMaxColumnsInSelect() throws java.sql.SQLException {
        return wrappedObject.getMaxColumnsInSelect();
    }

    @Override
    public int getMaxColumnsInTable() throws java.sql.SQLException {
        return wrappedObject.getMaxColumnsInTable();
    }

    @Override
    public int getMaxConnections() throws java.sql.SQLException {
        return wrappedObject.getMaxConnections();
    }

    @Override
    public int getMaxCursorNameLength() throws java.sql.SQLException {
        return wrappedObject.getMaxCursorNameLength();
    }

    @Override
    public int getMaxIndexLength() throws java.sql.SQLException {
        return wrappedObject.getMaxIndexLength();
    }

    @Override
    public long getMaxLogicalLobSize() throws java.sql.SQLException {
        return wrappedObject.getMaxLogicalLobSize();
    }

    @Override
    public int getMaxProcedureNameLength() throws java.sql.SQLException {
        return wrappedObject.getMaxProcedureNameLength();
    }

    @Override
    public int getMaxRowSize() throws java.sql.SQLException {
        return wrappedObject.getMaxRowSize();
    }

    @Override
    public int getMaxSchemaNameLength() throws java.sql.SQLException {
        return wrappedObject.getMaxSchemaNameLength();
    }

    @Override
    public int getMaxStatementLength() throws java.sql.SQLException {
        return wrappedObject.getMaxStatementLength();
    }

    @Override
    public int getMaxStatements() throws java.sql.SQLException {
        return wrappedObject.getMaxStatements();
    }

    @Override
    public int getMaxTableNameLength() throws java.sql.SQLException {
        return wrappedObject.getMaxTableNameLength();
    }

    @Override
    public int getMaxTablesInSelect() throws java.sql.SQLException {
        return wrappedObject.getMaxTablesInSelect();
    }

    @Override
    public int getMaxUserNameLength() throws java.sql.SQLException {
        return wrappedObject.getMaxUserNameLength();
    }

    @Override
    public String getNumericFunctions() throws java.sql.SQLException {
        return wrappedObject.getNumericFunctions();
    }

    @Override
    public java.sql.ResultSet getPrimaryKeys(final String p0, final String p1, final String p2) throws java.sql.SQLException {
        return wrappedObject.getPrimaryKeys(p0, p1, p2);
    }

    @Override
    public java.sql.ResultSet getProcedureColumns(final String p0, final String p1, final String p2, final String p3) throws java.sql.SQLException {
        return wrappedObject.getProcedureColumns(p0, p1, p2, p3);
    }

    @Override
    public String getProcedureTerm() throws java.sql.SQLException {
        return wrappedObject.getProcedureTerm();
    }

    @Override
    public java.sql.ResultSet getProcedures(final String p0, final String p1, final String p2) throws java.sql.SQLException {
        return wrappedObject.getProcedures(p0, p1, p2);
    }

    @Override
    public java.sql.ResultSet getPseudoColumns(final String p0, final String p1, final String p2, final String p3) throws java.sql.SQLException {
        return wrappedObject.getPseudoColumns(p0, p1, p2, p3);
    }

    @Override
    public int getResultSetHoldability() throws java.sql.SQLException {
        return wrappedObject.getResultSetHoldability();
    }

    @Override
    public java.sql.RowIdLifetime getRowIdLifetime() throws java.sql.SQLException {
        return wrappedObject.getRowIdLifetime();
    }

    @Override
    public String getSQLKeywords() throws java.sql.SQLException {
        return wrappedObject.getSQLKeywords();
    }

    @Override
    public int getSQLStateType() throws java.sql.SQLException {
        return wrappedObject.getSQLStateType();
    }

    @Override
    public String getSchemaTerm() throws java.sql.SQLException {
        return wrappedObject.getSchemaTerm();
    }

    @Override
    public java.sql.ResultSet getSchemas() throws java.sql.SQLException {
        return wrappedObject.getSchemas();
    }

    @Override
    public java.sql.ResultSet getSchemas(final String p0, final String p1) throws java.sql.SQLException {
        return wrappedObject.getSchemas(p0, p1);
    }

    @Override
    public String getSearchStringEscape() throws java.sql.SQLException {
        return wrappedObject.getSearchStringEscape();
    }

    @Override
    public String getStringFunctions() throws java.sql.SQLException {
        return wrappedObject.getStringFunctions();
    }

    @Override
    public java.sql.ResultSet getSuperTables(final String p0, final String p1, final String p2) throws java.sql.SQLException {
        return wrappedObject.getSuperTables(p0, p1, p2);
    }

    @Override
    public java.sql.ResultSet getSuperTypes(final String p0, final String p1, final String p2) throws java.sql.SQLException {
        return wrappedObject.getSuperTypes(p0, p1, p2);
    }

    @Override
    public String getSystemFunctions() throws java.sql.SQLException {
        return wrappedObject.getSystemFunctions();
    }

    @Override
    public java.sql.ResultSet getTablePrivileges(final String p0, final String p1, final String p2) throws java.sql.SQLException {
        return wrappedObject.getTablePrivileges(p0, p1, p2);
    }

    @Override
    public java.sql.ResultSet getTableTypes() throws java.sql.SQLException {
        return wrappedObject.getTableTypes();
    }

    @Override
    public java.sql.ResultSet getTables(final String p0, final String p1, final String p2, final String[] p3) throws java.sql.SQLException {
        return wrappedObject.getTables(p0, p1, p2, p3);
    }

    @Override
    public String getTimeDateFunctions() throws java.sql.SQLException {
        return wrappedObject.getTimeDateFunctions();
    }

    @Override
    public java.sql.ResultSet getTypeInfo() throws java.sql.SQLException {
        return wrappedObject.getTypeInfo();
    }

    @Override
    public java.sql.ResultSet getUDTs(final String p0, final String p1, final String p2, final int[] p3) throws java.sql.SQLException {
        return wrappedObject.getUDTs(p0, p1, p2, p3);
    }

    @Override
    public String getURL() throws java.sql.SQLException {
        return wrappedObject.getURL();
    }

    @Override
    public String getUserName() throws java.sql.SQLException {
        return wrappedObject.getUserName();
    }

    @Override
    public java.sql.ResultSet getVersionColumns(final String p0, final String p1, final String p2) throws java.sql.SQLException {
        return wrappedObject.getVersionColumns(p0, p1, p2);
    }

    @Override
    public boolean insertsAreDetected(final int p0) throws java.sql.SQLException {
        return wrappedObject.insertsAreDetected(p0);
    }

    @Override
    public boolean isCatalogAtStart() throws java.sql.SQLException {
        return wrappedObject.isCatalogAtStart();
    }

    @Override
    public boolean isReadOnly() throws java.sql.SQLException {
        return wrappedObject.isReadOnly();
    }

    @Override
    public boolean isWrapperFor(final Class<?> p0) throws java.sql.SQLException {
        return wrappedObject.isWrapperFor(p0);
    }

    @Override
    public boolean locatorsUpdateCopy() throws java.sql.SQLException {
        return wrappedObject.locatorsUpdateCopy();
    }

    @Override
    public boolean nullPlusNonNullIsNull() throws java.sql.SQLException {
        return wrappedObject.nullPlusNonNullIsNull();
    }

    @Override
    public boolean nullsAreSortedAtEnd() throws java.sql.SQLException {
        return wrappedObject.nullsAreSortedAtEnd();
    }

    @Override
    public boolean nullsAreSortedAtStart() throws java.sql.SQLException {
        return wrappedObject.nullsAreSortedAtStart();
    }

    @Override
    public boolean nullsAreSortedHigh() throws java.sql.SQLException {
        return wrappedObject.nullsAreSortedHigh();
    }

    @Override
    public boolean nullsAreSortedLow() throws java.sql.SQLException {
        return wrappedObject.nullsAreSortedLow();
    }

    @Override
    public boolean othersDeletesAreVisible(final int p0) throws java.sql.SQLException {
        return wrappedObject.othersDeletesAreVisible(p0);
    }

    @Override
    public boolean othersInsertsAreVisible(final int p0) throws java.sql.SQLException {
        return wrappedObject.othersInsertsAreVisible(p0);
    }

    @Override
    public boolean othersUpdatesAreVisible(final int p0) throws java.sql.SQLException {
        return wrappedObject.othersUpdatesAreVisible(p0);
    }

    @Override
    public boolean ownDeletesAreVisible(final int p0) throws java.sql.SQLException {
        return wrappedObject.ownDeletesAreVisible(p0);
    }

    @Override
    public boolean ownInsertsAreVisible(final int p0) throws java.sql.SQLException {
        return wrappedObject.ownInsertsAreVisible(p0);
    }

    @Override
    public boolean ownUpdatesAreVisible(final int p0) throws java.sql.SQLException {
        return wrappedObject.ownUpdatesAreVisible(p0);
    }

    @Override
    public boolean storesLowerCaseIdentifiers() throws java.sql.SQLException {
        return wrappedObject.storesLowerCaseIdentifiers();
    }

    @Override
    public boolean storesLowerCaseQuotedIdentifiers() throws java.sql.SQLException {
        return wrappedObject.storesLowerCaseQuotedIdentifiers();
    }

    @Override
    public boolean storesMixedCaseIdentifiers() throws java.sql.SQLException {
        return wrappedObject.storesMixedCaseIdentifiers();
    }

    @Override
    public boolean storesMixedCaseQuotedIdentifiers() throws java.sql.SQLException {
        return wrappedObject.storesMixedCaseQuotedIdentifiers();
    }

    @Override
    public boolean storesUpperCaseIdentifiers() throws java.sql.SQLException {
        return wrappedObject.storesUpperCaseIdentifiers();
    }

    @Override
    public boolean storesUpperCaseQuotedIdentifiers() throws java.sql.SQLException {
        return wrappedObject.storesUpperCaseQuotedIdentifiers();
    }

    @Override
    public boolean supportsANSI92EntryLevelSQL() throws java.sql.SQLException {
        return wrappedObject.supportsANSI92EntryLevelSQL();
    }

    @Override
    public boolean supportsANSI92FullSQL() throws java.sql.SQLException {
        return wrappedObject.supportsANSI92FullSQL();
    }

    @Override
    public boolean supportsANSI92IntermediateSQL() throws java.sql.SQLException {
        return wrappedObject.supportsANSI92IntermediateSQL();
    }

    @Override
    public boolean supportsAlterTableWithAddColumn() throws java.sql.SQLException {
        return wrappedObject.supportsAlterTableWithAddColumn();
    }

    @Override
    public boolean supportsAlterTableWithDropColumn() throws java.sql.SQLException {
        return wrappedObject.supportsAlterTableWithDropColumn();
    }

    @Override
    public boolean supportsBatchUpdates() throws java.sql.SQLException {
        return wrappedObject.supportsBatchUpdates();
    }

    @Override
    public boolean supportsCatalogsInDataManipulation() throws java.sql.SQLException {
        return wrappedObject.supportsCatalogsInDataManipulation();
    }

    @Override
    public boolean supportsCatalogsInIndexDefinitions() throws java.sql.SQLException {
        return wrappedObject.supportsCatalogsInIndexDefinitions();
    }

    @Override
    public boolean supportsCatalogsInPrivilegeDefinitions() throws java.sql.SQLException {
        return wrappedObject.supportsCatalogsInPrivilegeDefinitions();
    }

    @Override
    public boolean supportsCatalogsInProcedureCalls() throws java.sql.SQLException {
        return wrappedObject.supportsCatalogsInProcedureCalls();
    }

    @Override
    public boolean supportsCatalogsInTableDefinitions() throws java.sql.SQLException {
        return wrappedObject.supportsCatalogsInTableDefinitions();
    }

    @Override
    public boolean supportsColumnAliasing() throws java.sql.SQLException {
        return wrappedObject.supportsColumnAliasing();
    }

    @Override
    public boolean supportsConvert() throws java.sql.SQLException {
        return wrappedObject.supportsConvert();
    }

    @Override
    public boolean supportsConvert(final int p0, final int p1) throws java.sql.SQLException {
        return wrappedObject.supportsConvert(p0, p1);
    }

    @Override
    public boolean supportsCoreSQLGrammar() throws java.sql.SQLException {
        return wrappedObject.supportsCoreSQLGrammar();
    }

    @Override
    public boolean supportsCorrelatedSubqueries() throws java.sql.SQLException {
        return wrappedObject.supportsCorrelatedSubqueries();
    }

    @Override
    public boolean supportsDataDefinitionAndDataManipulationTransactions() throws java.sql.SQLException {
        return wrappedObject.supportsDataDefinitionAndDataManipulationTransactions();
    }

    @Override
    public boolean supportsDataManipulationTransactionsOnly() throws java.sql.SQLException {
        return wrappedObject.supportsDataManipulationTransactionsOnly();
    }

    @Override
    public boolean supportsDifferentTableCorrelationNames() throws java.sql.SQLException {
        return wrappedObject.supportsDifferentTableCorrelationNames();
    }

    @Override
    public boolean supportsExpressionsInOrderBy() throws java.sql.SQLException {
        return wrappedObject.supportsExpressionsInOrderBy();
    }

    @Override
    public boolean supportsExtendedSQLGrammar() throws java.sql.SQLException {
        return wrappedObject.supportsExtendedSQLGrammar();
    }

    @Override
    public boolean supportsFullOuterJoins() throws java.sql.SQLException {
        return wrappedObject.supportsFullOuterJoins();
    }

    @Override
    public boolean supportsGetGeneratedKeys() throws java.sql.SQLException {
        return wrappedObject.supportsGetGeneratedKeys();
    }

    @Override
    public boolean supportsGroupBy() throws java.sql.SQLException {
        return wrappedObject.supportsGroupBy();
    }

    @Override
    public boolean supportsGroupByBeyondSelect() throws java.sql.SQLException {
        return wrappedObject.supportsGroupByBeyondSelect();
    }

    @Override
    public boolean supportsGroupByUnrelated() throws java.sql.SQLException {
        return wrappedObject.supportsGroupByUnrelated();
    }

    @Override
    public boolean supportsIntegrityEnhancementFacility() throws java.sql.SQLException {
        return wrappedObject.supportsIntegrityEnhancementFacility();
    }

    @Override
    public boolean supportsLikeEscapeClause() throws java.sql.SQLException {
        return wrappedObject.supportsLikeEscapeClause();
    }

    @Override
    public boolean supportsLimitedOuterJoins() throws java.sql.SQLException {
        return wrappedObject.supportsLimitedOuterJoins();
    }

    @Override
    public boolean supportsMinimumSQLGrammar() throws java.sql.SQLException {
        return wrappedObject.supportsMinimumSQLGrammar();
    }

    @Override
    public boolean supportsMixedCaseIdentifiers() throws java.sql.SQLException {
        return wrappedObject.supportsMixedCaseIdentifiers();
    }

    @Override
    public boolean supportsMixedCaseQuotedIdentifiers() throws java.sql.SQLException {
        return wrappedObject.supportsMixedCaseQuotedIdentifiers();
    }

    @Override
    public boolean supportsMultipleOpenResults() throws java.sql.SQLException {
        return wrappedObject.supportsMultipleOpenResults();
    }

    @Override
    public boolean supportsMultipleResultSets() throws java.sql.SQLException {
        return wrappedObject.supportsMultipleResultSets();
    }

    @Override
    public boolean supportsMultipleTransactions() throws java.sql.SQLException {
        return wrappedObject.supportsMultipleTransactions();
    }

    @Override
    public boolean supportsNamedParameters() throws java.sql.SQLException {
        return wrappedObject.supportsNamedParameters();
    }

    @Override
    public boolean supportsNonNullableColumns() throws java.sql.SQLException {
        return wrappedObject.supportsNonNullableColumns();
    }

    @Override
    public boolean supportsOpenCursorsAcrossCommit() throws java.sql.SQLException {
        return wrappedObject.supportsOpenCursorsAcrossCommit();
    }

    @Override
    public boolean supportsOpenCursorsAcrossRollback() throws java.sql.SQLException {
        return wrappedObject.supportsOpenCursorsAcrossRollback();
    }

    @Override
    public boolean supportsOpenStatementsAcrossCommit() throws java.sql.SQLException {
        return wrappedObject.supportsOpenStatementsAcrossCommit();
    }

    @Override
    public boolean supportsOpenStatementsAcrossRollback() throws java.sql.SQLException {
        return wrappedObject.supportsOpenStatementsAcrossRollback();
    }

    @Override
    public boolean supportsOrderByUnrelated() throws java.sql.SQLException {
        return wrappedObject.supportsOrderByUnrelated();
    }

    @Override
    public boolean supportsOuterJoins() throws java.sql.SQLException {
        return wrappedObject.supportsOuterJoins();
    }

    @Override
    public boolean supportsPositionedDelete() throws java.sql.SQLException {
        return wrappedObject.supportsPositionedDelete();
    }

    @Override
    public boolean supportsPositionedUpdate() throws java.sql.SQLException {
        return wrappedObject.supportsPositionedUpdate();
    }

    @Override
    public boolean supportsRefCursors() throws java.sql.SQLException {
        return wrappedObject.supportsRefCursors();
    }

    @Override
    public boolean supportsResultSetConcurrency(final int p0, final int p1) throws java.sql.SQLException {
        return wrappedObject.supportsResultSetConcurrency(p0, p1);
    }

    @Override
    public boolean supportsResultSetHoldability(final int p0) throws java.sql.SQLException {
        return wrappedObject.supportsResultSetHoldability(p0);
    }

    @Override
    public boolean supportsResultSetType(final int p0) throws java.sql.SQLException {
        return wrappedObject.supportsResultSetType(p0);
    }

    @Override
    public boolean supportsSavepoints() throws java.sql.SQLException {
        return wrappedObject.supportsSavepoints();
    }

    @Override
    public boolean supportsSchemasInDataManipulation() throws java.sql.SQLException {
        return wrappedObject.supportsSchemasInDataManipulation();
    }

    @Override
    public boolean supportsSchemasInIndexDefinitions() throws java.sql.SQLException {
        return wrappedObject.supportsSchemasInIndexDefinitions();
    }

    @Override
    public boolean supportsSchemasInPrivilegeDefinitions() throws java.sql.SQLException {
        return wrappedObject.supportsSchemasInPrivilegeDefinitions();
    }

    @Override
    public boolean supportsSchemasInProcedureCalls() throws java.sql.SQLException {
        return wrappedObject.supportsSchemasInProcedureCalls();
    }

    @Override
    public boolean supportsSchemasInTableDefinitions() throws java.sql.SQLException {
        return wrappedObject.supportsSchemasInTableDefinitions();
    }

    @Override
    public boolean supportsSelectForUpdate() throws java.sql.SQLException {
        return wrappedObject.supportsSelectForUpdate();
    }

    @Override
    public boolean supportsStatementPooling() throws java.sql.SQLException {
        return wrappedObject.supportsStatementPooling();
    }

    @Override
    public boolean supportsStoredFunctionsUsingCallSyntax() throws java.sql.SQLException {
        return wrappedObject.supportsStoredFunctionsUsingCallSyntax();
    }

    @Override
    public boolean supportsStoredProcedures() throws java.sql.SQLException {
        return wrappedObject.supportsStoredProcedures();
    }

    @Override
    public boolean supportsSubqueriesInComparisons() throws java.sql.SQLException {
        return wrappedObject.supportsSubqueriesInComparisons();
    }

    @Override
    public boolean supportsSubqueriesInExists() throws java.sql.SQLException {
        return wrappedObject.supportsSubqueriesInExists();
    }

    @Override
    public boolean supportsSubqueriesInIns() throws java.sql.SQLException {
        return wrappedObject.supportsSubqueriesInIns();
    }

    @Override
    public boolean supportsSubqueriesInQuantifieds() throws java.sql.SQLException {
        return wrappedObject.supportsSubqueriesInQuantifieds();
    }

    @Override
    public boolean supportsTableCorrelationNames() throws java.sql.SQLException {
        return wrappedObject.supportsTableCorrelationNames();
    }

    @Override
    public boolean supportsTransactionIsolationLevel(final int p0) throws java.sql.SQLException {
        return wrappedObject.supportsTransactionIsolationLevel(p0);
    }

    @Override
    public boolean supportsTransactions() throws java.sql.SQLException {
        return wrappedObject.supportsTransactions();
    }

    @Override
    public boolean supportsUnion() throws java.sql.SQLException {
        return wrappedObject.supportsUnion();
    }

    @Override
    public boolean supportsUnionAll() throws java.sql.SQLException {
        return wrappedObject.supportsUnionAll();
    }

    @Override
    public <T> T unwrap(final Class<T> p0) throws java.sql.SQLException {
        return wrappedObject.unwrap(p0);
    }

    @Override
    public boolean updatesAreDetected(final int p0) throws java.sql.SQLException {
        return wrappedObject.updatesAreDetected(p0);
    }

    @Override
    public boolean usesLocalFilePerTable() throws java.sql.SQLException {
        return wrappedObject.usesLocalFilePerTable();
    }

    @Override
    public boolean usesLocalFiles() throws java.sql.SQLException {
        return wrappedObject.usesLocalFiles();
    }
}

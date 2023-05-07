import { useState } from 'react';
import {
  TextInput,
  View,
  TouchableHighlight,
  StyleSheet,
  Text,
} from 'react-native';
import { useNavigation } from '@react-navigation/native';

export default function Formulario() {
  const navigate = useNavigation().navigate;
  const [form, setForm] = useState({
    nome: 'Nome teste',
    sobrenome: '',
    telefone: '',
    endereco: '',
  });

  const onChangeText = (text, field) => {
    let newForm = form;
    newForm[field] = text;
    console.log('newForm: ', newForm);
    setForm(newForm);
  };

  return (
    <View style={styles.container}>
      <Text>Seu Primeiro Nome</Text>
      <TextInput
        style={styles.inputs}
        placeholder="Digite seu Primeiro Nome"
        onChangeText={(text) => onChangeText(text, 'nome')}
      />
      <Text>Seu Sobrenome</Text>
      <TextInput
        style={styles.inputs}
        placeholder="Digite seu Sobrenome"
        onChangeText={(text) => onChangeText(text, 'sobrenome')}
      />
      <Text>Seu Telefone</Text>
      <TextInput
        style={styles.inputs}
        placeholder="Digite seu Telefone"
        onChangeText={(text) => onChangeText(text, 'telefone')}
      />
      <Text>Seu Endereço</Text>
      <TextInput
        style={styles.inputs}
        placeholder="Digite seu Endereço"
        onChangeText={(text) => onChangeText(text, 'endereco')}
      />

      <TouchableHighlight
        style={styles.touchable}
        onPress={() => navigate('DADOS', { paramKey: form })}>
        <View style={styles.button}>
          <Text>Confirmar</Text>
        </View>
      </TouchableHighlight>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
    margin: 10,
  },

  inputs: {
    width: '80%',
    fontSize: 16,
    borderColor: 'black',
    borderRadius: 5,
    borderWidth: 1,
    padding: 10,
    margin: 5,
  },

  touchable: {
    padding: 10,
  },

  button: {
    alignItems: 'center',
    backgroundColor: '#DDDDDD',
    padding: 10,
  },
});
